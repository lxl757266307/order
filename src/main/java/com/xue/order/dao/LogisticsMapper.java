package com.xue.order.dao;

import com.xue.order.pojo.Logistics;
import com.xue.order.pojo.LogisticsExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;


public interface LogisticsMapper {
    int countByExample(LogisticsExample example);

    int deleteByExample(LogisticsExample example);

    int insert(Logistics record);

    @Delete("DELETE FROM LOGISTICS WHERE ID = #{id}")
    int delete(@Param("id") String id);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsExample example);

    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsExample example);
}