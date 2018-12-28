package com.xue.order.dao;

import com.xue.order.pojo.OrderStatus;
import com.xue.order.pojo.OrderStatusExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface OrderStatusMapper {
    int countByExample(OrderStatusExample example);

    int deleteByExample(OrderStatusExample example);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    List<OrderStatus> selectByExample(OrderStatusExample example);

    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);


    //    更新订单的状态
    @Update("UPDATE  ORDER_STATUS  SET STATUS = #{status}  WHERE ORDER_ID = #{orderId} AND USER_ID = #{userId}")
    int updateOrderLogistics(@Param("userId") String userId, @Param("orderId") String orderId, @Param("status") int status);
}