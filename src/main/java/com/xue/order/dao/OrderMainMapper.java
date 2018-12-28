package com.xue.order.dao;

import com.xue.order.pojo.OrderMain;
import com.xue.order.pojo.OrderMainExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMainMapper {
    int countByExample(OrderMainExample example);

    int deleteByExample(OrderMainExample example);

    int insert(OrderMain record);

    int insertSelective(OrderMain record);

    List<OrderMain> selectByExample(OrderMainExample example);

    int updateByExampleSelective(@Param("record") OrderMain record, @Param("example") OrderMainExample example);

    int updateByExample(@Param("record") OrderMain record, @Param("example") OrderMainExample example);


    //    根据订单的状态查询相对应的订单
    @Select("SELECT\n" +
            "ORDER_MAIN.ORDER_ID,\n" +
            "ORDER_MAIN.SINGLE_PERSON,\n" +
            "ORDER_MAIN.CREATE_TIME,\n" +
            "ORDER_MAIN.TOTAL_MONEY,\n" +
            "ORDER_MAIN.UPDATE_TIME,\n" +
            "ORDER_STATUS.STATUS\n" +
            "ORDER_STATUS.ID\n" +
            "FROM\n" +
            "ORDER_MAIN ,\n" +
            "ORDER_STATUS  WHERE ORDER_MAIN.ORDER_ID = #{orderId} AND ORDER_STATUS.ID = #{orderId} AND ORDER_STATUS.STATUS = #{status}")
    List<OrderMain> selectOrderMainList(@Param("status") int status, @Param("orderId") String orderId);


    @Select("SELECT\n" +
            "ORDER_MAIN.ORDER_ID,\n" +
            "ORDER_MAIN.SINGLE_PERSON,\n" +
            "ORDER_MAIN.CREATE_TIME,\n" +
            "ORDER_MAIN.TOTAL_NUMBER,\n" +
            "ORDER_MAIN.TOTAL_MONEY,\n" +
            "ORDER_MAIN.UPDATE_PERSON,\n" +
            "ORDER_MAIN.ADDRESS_ID,\n" +
            "ORDER_MAIN.UPDATE_TIME,\n" +
            "ORDER_MAIN.KINDS_ID,\n" +
            "ORDER_MAIN.KINDS_PRICE,\n" +
            "ORDER_MAIN.KINDS_NUMBER,\n" +
            "ORDER_MAIN.TOTAL_MONEEY,\n" +
            "ORDER_MAIN.USER_ID,\n" +
            "ORDER_MAIN.LOGITICS_ID\n" +
            "FROM ORDER_MAIN WHERE ORDER_ID = #{orderId}")
    OrderMain getOrderDetails(@Param("orderId") String orderId);


}