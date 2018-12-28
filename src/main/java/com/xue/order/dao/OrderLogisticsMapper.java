package com.xue.order.dao;

import com.xue.order.pojo.OrderLogistics;
import com.xue.order.pojo.OrderLogisticsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderLogisticsMapper {
    int countByExample(OrderLogisticsExample example);

    int deleteByExample(OrderLogisticsExample example);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    List<OrderLogistics> selectByExample(OrderLogisticsExample example);

    int updateByExampleSelective(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExample(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);


    @Select("SELECT\n" +
            "ORDER_LOGISTICS.ID,\n" +
            "ORDER_LOGISTICS.ORDER_ID,\n" +
            "ORDER_LOGISTICS.LOGISTICS_NAME,\n" +
            "ORDER_LOGISTICS.ADDRESS_ID,\n" +
            "ORDER_LOGISTICS.IS_SEND,\n" +
            "ORDER_LOGISTICS.REMARK1,\n" +
            "ORDER_LOGISTICS.REMARK2\n" +
            "FROM `ORDER_LOGISTICS` WHERE ORDER_ID = #{orderId} ")
    OrderLogistics selectOrderLogistice(@Param("orderId") String orderId);


}