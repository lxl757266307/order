package com.xue.order.dao;

import com.xue.order.pojo.SpecialShoping;
import com.xue.order.pojo.SpecialShopingExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SpecialShopingMapper {
    int countByExample(SpecialShopingExample example);

    int deleteByExample(SpecialShopingExample example);

    int insert(SpecialShoping record);

    int insertSelective(SpecialShoping record);

    List<SpecialShoping> selectByExample(SpecialShopingExample example);

    int updateByExampleSelective(@Param("record") SpecialShoping record, @Param("example") SpecialShopingExample example);

    int updateByExample(@Param("record") SpecialShoping record, @Param("example") SpecialShopingExample example);

    @Select("SELECT * FROM SPECIALSHOPING WHERE  ISUSE=0 ")
    List<SpecialShoping> selectUnUseShoping();

    @Select("SELECT * FROM SPECIALSHOPING WHERE  ISUSE=1 ")
    List<SpecialShoping> selectAllUseShoping();

    @Select("SELECT * FROM SPECIALSHOPING WHERE KINDSPARENTID=#{kindsparentid} AND USERID=#{userId}")
    List<SpecialShoping> selectUnUseShopingByUserId(@Param("kindsparentid") String kindsparentid, @Param("userId") String userId);

    @Select("SELECT COUNT(*) FROM SPECIALSHOPING WHERE KINDSPARENTID=#{kindsparentid} AND USERID=#{userId}")
    int countUnUseShopingByUserId(@Param("kindsparentid") String kindsparentid, @Param("userId") String userId);

    @Select("SELECT\n" +
            "COUNT(*)\n" +
            "FROM\n" +
            "SPECIALPRICE\n" +
            "WHERE SPECIALPRICE.ISUSE=0")
    int selectCountUnUse();
}