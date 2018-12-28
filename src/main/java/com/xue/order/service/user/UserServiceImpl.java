package com.xue.order.service.user;

import com.github.pagehelper.PageHelper;
import com.xue.order.dao.UnCheckKindsMapper;
import com.xue.order.dao.UserMapper;
import com.xue.order.pojo.UnCheckKinds;
import com.xue.order.pojo.UnCheckKindsExample;
import com.xue.order.pojo.User;
import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UnCheckKindsMapper unCheckKindsMapper;

    @Override
    public ResultBean<User> login(User user) {
        ResultBean<User> userResultBean = new ResultBean<>();

        if (user.getPhone() == null || user.getPassword() == null) {

            return ResultUtils.parameterErr();
        }
        User us = userMapper.login(user.getPhone(), user.getPassword());

//        System.out.println("us=="+us.toString());

        if (us == null) {
            return ResultUtils.err();
        } else {

            if (us.getIsfree() == 1) {
                System.out.println("id==" + us.getId());
                int i = userMapper.updateUserOnline(us.getId());
                System.out.println("i==" + i);
                if (i > 0) {
                    User data = userMapper.selectUserById(us.getId());
                    return ResultUtils.successData(data);
                } else {
                    return ResultUtils.err();
                }
            } else {
                userResultBean.setMsg("当前用户已被禁用，请及时联系管理员！");
                userResultBean.setCode(ConstCode.USER_LOCKED);
                return userResultBean;
            }


        }
    }

    @Override
    public ResultBean<User> getUserInfo(String id) {
        if (id == null) {
            return ResultUtils.parameterErr();
        }
        User user = userMapper.selectUserInfoById(id);
        if (user == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(user);
    }

    @Override
    public ResultBean<User> register(User user) {
        user.setId("" + System.currentTimeMillis());
        long time = System.currentTimeMillis();
        if (user == null) {
            return ResultUtils.parameterErr();
        }
        User us = userMapper.selectByName(user.getUsername());
        if (us != null) {
            return ResultUtils.userHadRegister();
        }
        user.setCreatetime(new Date(time));
        user.setIsfree(ConstCode.USER_ACTIVED);
        int code = userMapper.insertSelective(user);
        System.out.println("code===" + code);
        if (code > 0) {
            User u = userMapper.selectByPhone(user.getPhone());
            return ResultUtils.successData(u);
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<User> checkUserRepeat(String phone) {
        User user = userMapper.selectByPhone(phone);
        if (user != null) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setMsg("当前用户已存在！");
            userResultBean.setCode(ConstCode.USER_HAD_REGISTER);
            return userResultBean;
        }
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setCode(ConstCode.NOMAL_CODE);
        return userResultBean;
    }

    @Override
    public ResultBean<User> seletUserByName(String name) {
        User user = userMapper.selectByName(name);
        if (user != null) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setData(user);
            userResultBean.setCode(ConstCode.NOMAL_CODE);
            return userResultBean;
        }
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setCode(ConstCode.NO_DATA);
        userResultBean.setMsg("查无此人！");
        return userResultBean;
    }

    @Override
    public ResultBean<User> seletUserByPhone(String phone) {

        User user = userMapper.selectByPhone(phone);
        if (user != null) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setData(user);
            userResultBean.setCode(ConstCode.NOMAL_CODE);
            return userResultBean;
        }
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setCode(ConstCode.NO_DATA);
        userResultBean.setMsg("查无此人！");
        return userResultBean;
    }

    @Override
    public ResultBean<User> lockingUser(String id) {

        if (id == null) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setMsg("参数为空！");
            userResultBean.setCode(ConstCode.PARAMETER);
            return userResultBean;
        }

//        0代表枷锁 禁用
        int code = userMapper.lockUser(ConstCode.USER_LOCKED, id);
        if (code > 0) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setMsg("禁用成功！");
            userResultBean.setCode(ConstCode.NOMAL_CODE);
            return userResultBean;
        }
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setMsg("禁用失败！");
        userResultBean.setCode(ConstCode.ERROR);
        return userResultBean;
    }

    @Override
    public ResultBean<User> unlockUser(String id) {

        if (id == null) {
            return getUserResultBean();
        }

//        0代表枷锁 禁用
        int code = userMapper.lockUser(ConstCode.USER_ACTIVED, id);
        if (code > 0) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setMsg("启用成功！");
            userResultBean.setCode(ConstCode.NOMAL_CODE);
            return userResultBean;
        }
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setMsg("启用失败！");
        userResultBean.setCode(ConstCode.ERROR);
        return userResultBean;
    }

    private ResultBean<User> getUserResultBean() {
        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setMsg("参数为空！");
        userResultBean.setCode(ConstCode.PARAMETER);
        return userResultBean;
    }

    @Override
    public ResultBean<List<User>> getUserByPage(int type, int page, int pageSzie) {
        PageHelper.startPage(page, 10);
        List<User> list = userMapper.selectAllUser(type);
        ResultBean<List<User>> resultBean = new ResultBean<>();
        if (list == null) {
            return ResultUtils.noData();
        }


        if (list.size() > 0) {
            int i = userMapper.selectCountByType(type);
            resultBean.setData(list);
            resultBean.setCount(i);
            resultBean.setCode(ConstCode.NOMAL_CODE);
        }
        return resultBean;
    }

    @Override
    public ResultBean<List<User>> getUserUnCheckKindsByPage(int page, int pageSzie) {
        PageHelper.startPage(page, pageSzie);
        List<User> users = userMapper.selectUserWithNoType();
        for (int i = 0; i < users.size(); i++) {
//            用户未被审核通过的二级分类数量
            int y = userMapper.selectUnCheckKindsCount(users.get(i).getId());
            users.get(i).setRemark1(String.valueOf(y));
        }
        int i = userMapper.selectUserWithNoTypeCount();
        if (users == null) {
            return ResultUtils.noData();
        }
        if (users.size() == 0) {
            return ResultUtils.noData();
        }
        if (users.size() > 0) {
            return ResultUtils.successData(i, users);
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<User>> selectAllUserByPage(int page, int pageSzie) {
        System.out.println("page=" + page + "---pagesize==" + pageSzie);
        if (page == 0 || pageSzie == 0) {
            return ResultUtils.parameterErr();
        }
        PageHelper.startPage(page, pageSzie);
        List<User> list = userMapper.selectAllUserByPage();
        System.out.println("list:===" + list.size());
        if (list == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(list);
    }

    @Override
    public ResultBean<User> updateUserPhoto(String imgUrl, String id) {
        int code = userMapper.updateUserPhoto(imgUrl, id);
        if (code > 0) {
            ResultBean<User> userResultBean = new ResultBean<>();
            userResultBean.setMsg("更新成功！");
            userResultBean.setCode(ConstCode.NOMAL_CODE);
            return userResultBean;
        }

        ResultBean<User> userResultBean = new ResultBean<>();
        userResultBean.setMsg("更新失败！");
        userResultBean.setCode(ConstCode.ERROR);
        return userResultBean;
    }

    @Override
    public ResultBean<List<User>> selectUserBykindId(String kindid) {
        if (kindid == null) {
            return ResultUtils.parameterErr();
        }
        List<User> list = userMapper.selectUserByKindId(kindid);
        if (list == null) {
            return ResultUtils.noData();
        }

        if (list.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(list);
    }

    @Override
    public ResultBean<List<User>> selectUserByLikeXX(String name) {
        if (name == null) {
            return ResultUtils.parameterErr();
        }
        List<User> list = userMapper.selectUserLikeXX(name);
        if (list == null) {
            return ResultUtils.noData();
        }

        if (list.size() == 0) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(list);
    }


}
