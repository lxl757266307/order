package com.xue.order.dao;

import com.xue.order.pojo.SpecialPrice;
import com.xue.order.pojo.SpecialPriceExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SpecialPriceMapper {
    int countByExample(SpecialPriceExample example);

    int deleteByExample(SpecialPriceExample example);

    int insert(SpecialPrice record);

    int insertSelective(SpecialPrice record);

    List<SpecialPrice> selectByExample(SpecialPriceExample example);

    int updateByExampleSelective(@Param("record") SpecialPrice record, @Param("example") SpecialPriceExample example);

    int updateByExample(@Param("record") SpecialPrice record, @Param("example") SpecialPriceExample example);

    @Update("UPDATE SPECIALPRICE SET ISUSE=#{isUse} WHERE SPECIALID=#{id}")
    int updateSpecialStatus(@Param("isUse") int isUse, @Param("id") String id);

    @Select("SELECT * FROM SPECIALPRICE WHERE KINDSID=#{id}")
    SpecialPrice selectSpecialPriceById(@Param("id") String id);

    @Delete("DELETE SPECIALPRICE  WHERE KINDSID=#{id}")
    SpecialPrice deleteSpecialPriceById(@Param("id") String id);

    @Select("SELECT\n" +
            "count(`USER`.ID)\n" +
            "FROM\n" +
            "SPECIALPRICE ,\n" +
            "`USER`\n" +
            "WHERE\n" +
            "`USER`.ID = SPECIALPRICE.USERID AND\n" +
            "`USER`.ID = #{id} AND\n" +
            "SPECIALPRICE.ISUSE =0 ")
    int countUnCheckSpecialPrice(@Param("id") String id);

    @Select("SELECT\n" +
            "count(*)\n" +
            "FROM\n" +
            "SPECIALPRICE \n" +
            "WHERE\n" +
            "SPECIALPRICE.ISUSE = 0")
    int countAllUnCheckSpecialPrice();
}