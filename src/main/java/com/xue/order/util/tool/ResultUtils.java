package com.xue.order.util.tool;

import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;

public class ResultUtils {

    public static ResultBean success(String msg) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ConstCode.NOMAL_CODE);
        resultBean.setMsg(msg);
        return resultBean;
    }

    public static ResultBean userHadRegister() {
        ResultBean resultBean = new ResultBean();
        resultBean.setMsg("用户已存在！");
        resultBean.setCode(ConstCode.USER_HAD_REGISTER);
        return resultBean;
    }

    public static ResultBean successData(Object object) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ConstCode.NOMAL_CODE);
        resultBean.setData(object);
        return resultBean;
    }

    public static ResultBean successData(int count, Object object) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCount(count);
        resultBean.setCode(ConstCode.NOMAL_CODE);
        resultBean.setData(object);
        return resultBean;
    }

    public static ResultBean err() {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("服务器繁忙,请稍后再试！");
        return resultBean;
    }

    public static ResultBean parameterErr() {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ConstCode.PARAMETER);
        resultBean.setMsg("参数错误");
        return resultBean;
    }

    public static ResultBean noData() {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(ConstCode.NO_DATA);
        resultBean.setMsg("暂无数据");
        return resultBean;
    }
}
