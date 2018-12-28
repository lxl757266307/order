package com.xue.order.service.order;

import com.xue.order.dao.*;
import com.xue.order.pojo.*;
import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMainMapper orderMainMapper;

    @Autowired
    OrderLogisticsMapper orderLogisticsMapper;


    @Autowired
    OrderStatusMapper orderStatusMapper;

    @Autowired
    OrderUserMapper orderUserMapper;


    @Override
    public ResultBean insertOrder(OrderMain orderMain) {

        String userId = orderMain.getUserId();
        ResultBean resultBean = new ResultBean();
        if (userId == null || orderMain.getAddressId() == null
                || orderMain.getSinglePerson() == null
                || orderMain.getTotalMoney() == null
                || orderMain.getTotalNumber() == null
        ) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("订单参数异常");
            return resultBean;
        }
//        long time = System.currentTimeMillis();
        Date date = new Date();
        String orderId = UUID.randomUUID().toString() + System.currentTimeMillis();
        orderMain.setOrderId(orderId);
        orderMain.setCreateTime(date);

        int code = orderMainMapper.insertSelective(orderMain);
        if (code > 0) {
            //        订单下单的状态
            OrderStatus orderStatus = new OrderStatus();
            orderStatus.setStatus(ConstCode.ORDER_COMMIN);
            orderStatus.setId(orderId);
            orderStatus.setUpdateTime(date);
            orderStatusMapper.insertSelective(orderStatus);


            OrderUser orderUser = new OrderUser();
            orderUser.setOrderId(orderId);
            orderUser.setUserId(userId);
            orderUser.setStartTime(date);
            orderUserMapper.insertSelective(orderUser);

            OrderLogistics orderLogistics = new OrderLogistics();
            orderLogistics.setAddressId(orderMain.getAddressId());
            orderLogisticsMapper.insertSelective(orderLogistics);

            resultBean.setMsg("插入数据成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        }

        resultBean.setMsg("插入数据失败");
        resultBean.setCode(ConstCode.ERROR);
        return resultBean;
    }

    @Override
    public ResultBean updateOrder(OrderMain orderMain) {

        ResultBean resultBean = new ResultBean();
        if (orderMain.getOrderId() == null || orderMain.getUserId() == null) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数有误");
            return resultBean;
        }

        OrderMainExample orderMainExample = new OrderMainExample();
        int code = orderMainMapper.updateByExampleSelective(orderMain, orderMainExample);
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("更新成功");
            return resultBean;
        } else {
            resultBean.setCode(ConstCode.ERROR);
            resultBean.setMsg("更新失败");
            return resultBean;
        }

    }

    @Override
    public ResultBean deleteOrder(String orderId, String userId) {
        ResultBean resultBean = new ResultBean();
        if (orderId == null || userId == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        int code = orderUserMapper.deleteOrder(userId, orderId);
        if (code > 0) {
            resultBean.setMsg("删除成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        } else {
            resultBean.setMsg("删除失败");
            resultBean.setCode(ConstCode.ERROR);
            return resultBean;
        }
    }

    @Override
    public ResultBean<OrderMain> getOrderMain(String orderId) {
        ResultBean<OrderMain> resultBean = new ResultBean();
        if (orderId == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        OrderMain orderDetails = orderMainMapper.getOrderDetails(orderId);
        if (orderDetails != null) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setData(orderDetails);
            return resultBean;
        } else {
            resultBean.setCode(ConstCode.NO_DATA);
            resultBean.setMsg("暂无数据");
            return resultBean;
        }
    }

    @Override
    public ResultBean<List<OrderMain>> getOrderMainList(String userId, int status) {
        ResultBean resultBean = new ResultBean();
        if (userId == null) {
            resultBean.setCode(ConstCode.PARAMETER);
            resultBean.setMsg("参数有误");
            return resultBean;
        }

        List<OrderUser> orderUsers = orderUserMapper.selectUser(userId);
        if (orderUsers != null) {
            List<OrderMain> orderMains = orderMainMapper.selectOrderMainList(status, userId);
            if (orderMains != null) {
                if (orderMains.size() > 0) {
                    resultBean.setCode(ConstCode.NOMAL_CODE);
                    resultBean.setData(orderMains);
                    return resultBean;
                } else {
                    resultBean.setCode(ConstCode.NO_DATA);
                    resultBean.setMsg("暂无数据");
                    return resultBean;
                }
            } else {
                resultBean.setCode(ConstCode.NO_DATA);
                resultBean.setMsg("暂无数据");
                return resultBean;
            }
        } else {
            resultBean.setMsg("暂无数据");
            resultBean.setCode(ConstCode.NO_DATA);
            return resultBean;
        }


    }

    @Override
    public ResultBean insertOrderLogistics(OrderLogistics orderLogistics) {
        ResultBean resultBean = new ResultBean();
        if (orderLogistics.getAddressId() == null ||
                orderLogistics.getLogisticsId() == null ||
                orderLogistics.getOrderId() == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        String id = UUID.randomUUID().toString() + System.currentTimeMillis();
        orderLogistics.setId(id);
        int code = orderLogisticsMapper.insertSelective(orderLogistics);
        if (code > 0) {
            resultBean.setMsg("插入成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        } else {
            resultBean.setMsg("插入失败");
            resultBean.setCode(ConstCode.ERROR);
            return resultBean;
        }
    }

    @Override
    public ResultBean updateOrderLogistics(OrderLogistics orderLogistics) {
        ResultBean resultBean = new ResultBean();
        if (orderLogistics.getAddressId() == null ||
                orderLogistics.getLogisticsId() == null ||
                orderLogistics.getOrderId() == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        OrderLogisticsExample orderLogisticsExample = new OrderLogisticsExample();
        int code = orderLogisticsMapper.updateByExampleSelective(orderLogistics, orderLogisticsExample);
        if (code > 0) {
            resultBean.setMsg("更新成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        } else {
            resultBean.setMsg("更新失败");
            resultBean.setCode(ConstCode.ERROR);
            return resultBean;
        }
    }

    @Override
    public ResultBean<OrderLogistics> getOrderLogisticsInfo(String orderId) {
        ResultBean<OrderLogistics> resultBean = new ResultBean();
        if (orderId == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        OrderLogistics orderLogistics = orderLogisticsMapper.selectOrderLogistice(orderId);
        if (orderLogistics != null) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setData(orderLogistics);
            return resultBean;
        }
        resultBean.setCode(ConstCode.NO_DATA);
        resultBean.setMsg("暂无数据");
        return resultBean;
    }

    @Override
    public ResultBean updateOrderStatus(String orderId, String userId, int status) {

        ResultBean<OrderLogistics> resultBean = new ResultBean();
        if (orderId == null ||
                userId == null) {
            resultBean.setMsg("参数有误");
            resultBean.setCode(ConstCode.PARAMETER);
            return resultBean;
        }
        int code = orderStatusMapper.updateOrderLogistics(userId, orderId, status);
        if (code > 0) {
            resultBean.setMsg("更新成功");
            resultBean.setCode(ConstCode.NOMAL_CODE);
            return resultBean;
        } else {
            resultBean.setMsg("更新失败");
            resultBean.setCode(ConstCode.ERROR);
            return resultBean;
        }
    }


}
