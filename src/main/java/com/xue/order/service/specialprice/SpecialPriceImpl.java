package com.xue.order.service.specialprice;

import com.github.pagehelper.PageHelper;
import com.xue.order.dao.SpecialPriceMapper;
import com.xue.order.dao.SpecialShopingMapper;
import com.xue.order.dao.UserMapper;
import com.xue.order.pojo.*;
import com.xue.order.service.jedis.JedisClient;
import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpecialPriceImpl implements SpecialPriceService {
    @Autowired
    JedisClient jedisClient;
    @Autowired
    SpecialPriceMapper specialPriceMapper;
    @Autowired
    SpecialShopingMapper specialShopingMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public ResultBean insertSprcialPrie(SpecialPrice specialPrice) {
        if (specialPrice == null) {
            return ResultUtils.parameterErr();
        }

        if (specialPriceMapper.selectSpecialPriceById(specialPrice.getKindsid()) == null) {
            String id = "" + System.currentTimeMillis();
            specialPrice.setSpecialid(id);
            int i = specialPriceMapper.insertSelective(specialPrice);
            if (i > 0) {
                return ResultUtils.success("设置特价商品成功");
            }
        } else {
            int i = specialPriceMapper.updateByExampleSelective(specialPrice, new SpecialPriceExample());
            if (i > 0) {
                return ResultUtils.success("设置特价商品成功");
            }
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean checkSprcialPrie(SpecialPrice specialPrice) {
        if (specialPrice == null) {
            return ResultUtils.parameterErr();
        }
        int i = specialPriceMapper.updateSpecialStatus(specialPrice.getIsuse(), specialPrice.getSpecialid());
        if (i > 0) {
            int time = specialPrice.getExpire();
            jedisClient.set(specialPrice.getSpecialid(), specialPrice.getKindsid());
            jedisClient.expire(specialPrice.getSpecialid(), time);
            return ResultUtils.success("设置特价商品成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<SpecialShoping>> selectAllSpecialPrice(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<SpecialShoping> specialPrices = specialShopingMapper.selectByExample(new SpecialShopingExample());
        for (int i = 0; i < specialPrices.size(); i++) {
            if (jedisClient.get(specialPrices.get(i).getSpecialid()) == null) {
                specialPrices.remove(i);
            }
        }
        if (specialPrices != null) {
            return ResultUtils.successData(specialPrices);
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<SpecialPrice>> selectAllUnUseSpecialPrice(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<SpecialShoping> specialShopings = specialShopingMapper.selectUnUseShoping();
        if (specialShopings == null) {
            return ResultUtils.noData();
        }
        int i = specialShopingMapper.selectCountUnUse();
        return ResultUtils.successData(i, specialShopings);
    }

    @Override
    public ResultBean<List<SpecialShoping>> selectUnUseShopingByUserId(String userId, String kindParentId, int page, int pageSize) {

        if (userId == null || kindParentId == null) {
            return ResultUtils.parameterErr();
        }
        PageHelper.startPage(page, pageSize);
        List<SpecialShoping> specialShopings = specialShopingMapper.selectUnUseShopingByUserId(kindParentId, userId);
        if (specialShopings != null) {
            int i = specialShopingMapper.countUnUseShopingByUserId(kindParentId, userId);
            return ResultUtils.successData(i, specialShopings);
        }
        return ResultUtils.noData();
    }

    @Override
    public ResultBean<SpecialPrice> selectSpecialPrice(String kindsId) {
        return null;
    }

    @Override
    public ResultBean<List<User>> getUserSpecialUnCheckByPage(int page, int pageSzie) {
        PageHelper.startPage(page, pageSzie);
        List<User> users = userMapper.selectUserWithNoType();
        for (int i = 0; i < users.size(); i++) {
//            用户未被审核通过的二级分类数量
            int y = specialPriceMapper.countUnCheckSpecialPrice(users.get(i).getId());
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
    public ResultBean<List<SpecialShoping>> selectAllUseSpecialPrice(int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        List<SpecialShoping> specialPrices = specialShopingMapper.selectAllUseShoping();
        for (int i = 0; i < specialPrices.size(); i++) {
            if (jedisClient.get(specialPrices.get(i).getSpecialid()) == null) {
                specialPrices.remove(i);
            }
        }
        if (specialPrices != null) {
            return ResultUtils.successData(specialPrices);
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<SpecialShoping> selectSpecialPriceById(String id) {
        if (id == null) {
            return ResultUtils.parameterErr();
        }

        String key = jedisClient.get(id);
        if (key == null) {
            return ResultUtils.noData();
        }
        SpecialPrice specialPrice = specialPriceMapper.selectSpecialPriceById(id);
        if (specialPrice == null) {
            return ResultUtils.noData();
        }
        return ResultUtils.successData(specialPrice);
    }
}
