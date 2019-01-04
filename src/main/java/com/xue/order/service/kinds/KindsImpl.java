package com.xue.order.service.kinds;

import com.github.pagehelper.PageHelper;
import com.xue.order.dao.KindsMapper;
import com.xue.order.dao.UserMapper;
import com.xue.order.pojo.Kinds;
import com.xue.order.pojo.User;
import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class KindsImpl implements KindsService {

    @Autowired
    KindsMapper kindsMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public ResultBean insertKinds(Kinds kinds) {

        System.out.println("kinds1111==" + kinds);

        if (kinds == null) {
            return ResultUtils.parameterErr();
        }
        kinds.setId(UUID.randomUUID().toString() + System.currentTimeMillis());
        String userId = kinds.getUserid();
        User user = userMapper.selectUserById(userId);

        if (user == null) {
            return ResultUtils.parameterErr();
        }
//        1代表 其他商户添加的 菜单 被启用 0 代表 不被启用
        if (ConstCode.ADMIN.equals(user.getUsername())) {
            kinds.setIsuse(ConstCode.IS_USER);
        } else {
            kinds.setIsuse(0);
        }
        kinds.setCreatetime(new Date(System.currentTimeMillis()));
        int code = kindsMapper.insert(kinds);
        if (code > 0) {

            return ResultUtils.success("插入成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean selectKindsByCode(String code) {
        if (code == null) {
            return ResultUtils.parameterErr();
        }

        Kinds kinds = kindsMapper.selectKindsByCode(code);
        if (kinds != null) {
            return ResultUtils.success("当前商品编码已存在");
        }
        return ResultUtils.noData();
    }

    @Override
    public ResultBean deleteKindsById(String id) {
        ResultBean resultBean = new ResultBean();
        if (id == null) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数有误！");
            return resultBean;
        }

        int code = kindsMapper.deleteKindById(id);
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("删除成功");
            return resultBean;
        }
        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("删除失败");
        return resultBean;
    }

    @Override
    public ResultBean updateKindsById(Kinds kinds) {
        if (kinds == null) {
            return ResultUtils.parameterErr();
        }
        int code = kindsMapper.updateKindsUseById(kinds.getIsuse(), kinds.getId());

        if (code > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean updateKindsSaleAfterById(Kinds kinds) {
        if (kinds == null) {
            return ResultUtils.parameterErr();
        }
        int code = kindsMapper.updateKindsSaleAfterById(kinds.getIsapplyaftersale(), kinds.getId());

        if (code > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean updateKindsSpecialOfferById(Kinds kinds) {
        if (kinds == null) {
            return ResultUtils.parameterErr();
        }
        int code = kindsMapper.updateKindsSpecialOfferById(kinds.getIsspecialoffer(), kinds.getId());

        if (code > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<Kinds>> selectFirstKindsByParentId(int isUse, String parentdId) {
        if (parentdId == null) {
            return ResultUtils.parameterErr();
        }
        List<Kinds> kinds = kindsMapper.selectFirstKindsByParentId(parentdId, isUse);

        if (kinds == null || kinds.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean<List<Kinds>> selectFirstKindsByParentIdAndUserId(String userId, int isUse, String parentdId, int page, int pageSize) {

        if (userId == null || parentdId == null) {

            return ResultUtils.parameterErr();
        }


        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectFirstKindsByParentIdAndUserId(parentdId, isUse, userId);

        if (kinds == null || kinds.size() == 0) {

            return ResultUtils.noData();
        }

        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean<List<Kinds>> selectOtherKindsByParentId(int isUse, String parentdId, int page, int pageSize) {
        if (parentdId == null) {
            return ResultUtils.parameterErr();
        }
        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectOtherKindsByParentId(parentdId, isUse);
        int count = kindsMapper.selectCountByKindsparentidAndIsUse(parentdId, isUse);
        if (kinds == null || kinds.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(count, kinds);

    }

    @Override
    public ResultBean<List<Kinds>> selectOtherKindsByParentIdAndUserId(String userId, int isUse, String parentdId, int page, int pageSize) {
        ResultBean<List<Kinds>> resultBean = new ResultBean<List<Kinds>>();
        if (parentdId == null) {
            return ResultUtils.parameterErr();
        }
        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectOtherKindsByParentIdAndUserId(parentdId, isUse, userId);
        int count = kindsMapper.selectCountByKindsparentid(parentdId, userId);

        if (kinds == null || kinds.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(count, kinds);

    }

    @Override
    public ResultBean<List<Kinds>> selectOtherKindsByParentIdAndUserId(String userId, String parentdId, int page, int pageSize) {

        if (userId == null || parentdId == null) {
            return ResultUtils.parameterErr();
        }
        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectOtherKindsByParentIdAndUserIdWithNoUse(parentdId, userId);
        int count = kindsMapper.selectCountByKindsparentid(parentdId, userId);
        if (kinds == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(count, kinds);
    }

    @Override
    public ResultBean<List<Kinds>> selectOtherKindsByLike(String content) {
        if (content == null) {
            return ResultUtils.parameterErr();
        }
        List<Kinds> kinds = kindsMapper.selectKindsLikeXX(content, content);
        if (kinds == null || kinds.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean<Kinds> selectById(String id) {
        if (id == null) {
            return ResultUtils.parameterErr();
        }
        Kinds kinds = kindsMapper.selectById(id);
        if (kinds == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean<List<Kinds>> selectShopKinds(String userId, int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectShopKinds(userId);
        if (kinds == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean<List<Kinds>> selectShopKindsLikeXX(String userId, String content) {
        if (userId == null || content == null) {
            return ResultUtils.parameterErr();
        }
        List<Kinds> kinds = kindsMapper.selectShopKindsLikeXX(content, content, userId);
        if (kinds == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(kinds);
    }

    @Override
    public ResultBean updateNewById(Kinds kinds) {
        if (kinds == null) {
            return ResultUtils.parameterErr();
        }
        int i = kindsMapper.updateKindsNewById(kinds.getIsnew(), kinds.getId());
        if (i > 0) {
            return ResultUtils.success("");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<Kinds>> selectNewKinds(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Kinds> kinds = kindsMapper.selectNewKinds();
        if (kinds == null) {
            return ResultUtils.noData();
        }

        if (kinds.size() <= 0) {
            return ResultUtils.noData();
        }

        return ResultUtils.successData(kinds);

    }


}
