package com.xue.order.dao;

import com.xue.order.pojo.OrderUser;
import com.xue.order.pojo.OrderUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderUserMapper {
    int countByExample(OrderUserExample example);

    int deleteByExample(OrderUserExample example);

    int insert(OrderUser record);

    int insertSelective(OrderUser record);

    List<OrderUser> selectByExample(OrderUserExample example);

    int updateByExampleSelective(@Param("record") OrderUser record, @Param("example") OrderUserExample example);

    int updateByExample(@Param("record") OrderUser record, @Param("example") OrderUserExample example);

    @Delete("DELETE FROM ORDER_USER WHERE ORDER_ID = #{orderId} AND USER_ID = #{userId}")
    int deleteOrder(@Param("userId") String userId, @Param("orderId") String orderId);

    @Select("SELECT * FROM ORDER_USER WHERE ORDER_ID = #{orderId} AND USER_ID = #{userId}")
    OrderUser select(@Param("userId") String userId, @Param("orderId") String orderId);

    @Select("SELECT * FROM ORDER_USER WHERE  USER_ID = #{userId}")
    List<OrderUser> selectUser(@Param("userId") String userId);
}