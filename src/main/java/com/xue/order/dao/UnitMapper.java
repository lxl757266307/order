package com.xue.order.dao;

import com.xue.order.pojo.Unit;
import com.xue.order.pojo.UnitExample;

import java.util.List;

import com.xue.order.util.bean.ResultBean;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UnitMapper {
    int countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    @Delete("DELETE FROM UNIT WHERE ID = #{id}")
    int deleteById(@Param("id") String id);

    @Update("UPDATE UNIT SET NAME = #{name} , REMARK = #{remark} WHERE ID = #{id}")
    int updateUnit(@Param("id") String id, @Param("name") String name, @Param("remark") String remark);

    @Select("SELECT * FROM UNIT")
    List<Unit> selectUnit();

    @Select("SELECT ID,NAME,REMARK FROM UNIT WHERE ID = #{id}")
    Unit selectUnitById(@Param("id") String id);


}