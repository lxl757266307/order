package com.xue.order.service.unit;

import com.xue.order.dao.UnitMapper;
import com.xue.order.pojo.Unit;
import com.xue.order.pojo.UnitExample;
import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UnitImpl implements UnitService {

    @Autowired
    UnitMapper unitMapper;


    @Override
    public ResultBean insertUnit(Unit unit) {
        ResultBean resultBean = new ResultBean();

        if (unit == null) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数为空");
            return resultBean;
        }

        unit.setId(UUID.randomUUID().toString() + System.currentTimeMillis());
        int code = unitMapper.insertSelective(unit);
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("插入成功");
            return resultBean;
        }

        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("插入失败");
        return resultBean;
    }

    @Override
    public ResultBean deleteUnit(String id) {
        ResultBean resultBean = new ResultBean();

        if (EmptyUtils.isEmpty(id)) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数为空");
            return resultBean;
        }
        int code = unitMapper.deleteById(id);

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
    public ResultBean updateUnit(Unit unit) {

        System.out.println("unit=="+unit);
        ResultBean<String> resultBean = new ResultBean<>();
        if (unit == null || unit.getId() == null || unit.getName() == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        int i = unitMapper.updateUnit(unit.getId(),unit.getName(),unit.getRemark());
        if (i > 0) {
            resultBean.setMsg("更新成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        }
        resultBean.setMsg("更新失败");
        resultBean.setCode(ConstCode.ERROR);
        return resultBean;
    }

    @Override
    public ResultBean<List<Unit>> selectUnit() {
        ResultBean<List<Unit>> resultBean = new ResultBean<>();
        List<Unit> data = unitMapper.selectUnit();
        if (data == null || data.size() == 0) {
            resultBean.setCode(ConstCode.NO_DATA);
            resultBean.setMsg("数据为空");
            return resultBean;
        }


        resultBean.setCode(ConstCode.NOMAL_CODE);
        resultBean.setData(data);
        return resultBean;
    }

    @Override
    public ResultBean<Unit> selectUnitById(String id) {
        ResultBean<Unit> resultBean = new ResultBean<>();
        if (id == null) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数为空");
            return resultBean;
        }
        Unit unit = unitMapper.selectUnitById(id);
        if (unit == null) {
            resultBean.setCode(ConstCode.NO_DATA);
            resultBean.setMsg("参数为空");
            return resultBean;
        }

        resultBean.setCode(ConstCode.NOMAL_CODE);
        resultBean.setData(unit);
        return resultBean;
    }
}
