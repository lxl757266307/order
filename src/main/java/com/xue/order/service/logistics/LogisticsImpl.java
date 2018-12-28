package com.xue.order.service.logistics;

import com.xue.order.dao.LogisticsMapper;
import com.xue.order.pojo.Logistics;
import com.xue.order.pojo.LogisticsExample;
import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LogisticsImpl implements LogisticsService {

    @Autowired
    LogisticsMapper logisticsMapper;

    @Override
    public ResultBean insertLogistcs(Logistics logistics) {

        if (logistics == null) {
            return ResultUtils.parameterErr();
        }
        String id = UUID.randomUUID().toString() + System.currentTimeMillis();
        logistics.setId(id);
        int i = logisticsMapper.insertSelective(logistics);
        if (i > 0) {
            return ResultUtils.success("添加成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean updateLogistcs(Logistics logistics) {
        if (logistics == null) {
            return ResultUtils.parameterErr();
        }
        int i = logisticsMapper.updateByExampleSelective(logistics, new LogisticsExample());
        if (i > 0) {
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean deletetLogistcs(String id) {
        if (id == null) {
            return ResultUtils.parameterErr();
        }
        int i = logisticsMapper.delete(id);
        if (i > 0) {
            return ResultUtils.success("删除成功");
        }
        return ResultUtils.err();
    }

    @Override
    public ResultBean<List<Logistics>> selectLogistcs() {

        List<Logistics> logistics = logisticsMapper.selectByExample(new LogisticsExample());
        if (logistics != null) {
            if (logistics.size() > 0) {
                return ResultUtils.successData(logistics);
            } else {
                return ResultUtils.noData();
            }
        }
        return ResultUtils.err();
    }
}
