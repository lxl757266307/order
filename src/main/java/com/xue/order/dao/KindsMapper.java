package com.xue.order.dao;

import com.xue.order.pojo.Kinds;
import com.xue.order.pojo.KindsExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface KindsMapper {
    int countByExample(KindsExample example);

    int deleteByExample(KindsExample example);

    int insert(Kinds record);

    int insertSelective(Kinds record);

    List<Kinds> selectByExampleWithBLOBs(KindsExample example);

    List<Kinds> selectByExample(KindsExample example);

    int updateByExampleSelective(@Param("record") Kinds record, @Param("example") KindsExample example);

    int updateByExampleWithBLOBs(@Param("record") Kinds record, @Param("example") KindsExample example);

    int updateByExample(@Param("record") Kinds record, @Param("example") KindsExample example);

    @Delete("DELETE FROM KINDS WHERE ID = #{id}")
    int deleteKindById(@Param("id") String id);

    @Update("UPDATE KINDS SET ISUSE = #{ isUse} WHERE ID = #{id}")
    int updateKindsUseById(@Param("isUse") int isUse, @Param("id") String id);

    @Update("UPDATE KINDS SET ISNEW = #{ isNew} WHERE ID = #{id}")
    int updateKindsNewById(@Param("isNew") int isUse, @Param("id") String id);

    @Update("UPDATE KINDS SET ISAPPLYAFTERSALE = #{ sale} WHERE ID = #{id}")
    int updateKindsSaleAfterById(@Param("sale") int sale, @Param("id") String id);

    //  设置 商品是否为特价
    @Update("UPDATE KINDS SET ISSPECIALOFFER = #{ special} WHERE ID = #{id}")
    int updateKindsSpecialOfferById(@Param("special") int isUse, @Param("id") String id);

    @Select("SELECT * FROM KINDS WHERE  KINDSPARENTID = #{id} AND ISUSE = #{isUse}")
    List<Kinds> selectFirstKindsByParentId(@Param("id") String id, @Param("isUse") int isUse);


    @Select("SELECT * FROM KINDS WHERE KINDS.KINDSPARENTID = #{id} AND KINDS.ISUSE = #{isUse} AND KINDS.USERID = #{userId}")
    List<Kinds> selectFirstKindsByParentIdAndUserId(@Param("id") String id, @Param("isUse") int isUse, @Param("userId") String userId);

    //    查询所有 被允许 使用的 食品种类
    @Select("SELECT *  FROM KINDS WHERE KINDS.KINDSPARENTID = #{id} AND KINDS.ISUSE = #{isUse}")
    List<Kinds> selectOtherKindsByParentId(@Param("id") String id, @Param("isUse") int isUse);

    //    查询所有 被允许 使用的 食品种类
    @Select("SELECT *  FROM KINDS WHERE SHOPINGCODE = #{code}")
    Kinds selectKindsByCode(@Param("code") String code);


    //    查询所有 被允许 使用的 食品种类
    @Select("SELECT * FROM KINDS WHERE KINDS.KINDSPARENTID = #{id} AND KINDS.ISUSE = #{isUse}  AND KINDS.USERID = #{userId}")
    List<Kinds> selectOtherKindsByParentIdAndUserId(@Param("id") String id, @Param("isUse") int isUse, @Param("userId") String userId);

    //    查询店铺 所有 被允许 使用的 食品种类
    @Select("SELECT * FROM KINDS WHERE KINDS.KINDSPARENTID <> 1 AND KINDS.ISUSE = 1  AND KINDS.USERID = #{userId}")
    List<Kinds> selectShopKinds(@Param("userId") String userId);

    @Select("SELECT * FROM KINDS WHERE KINDSPARENTID = #{id}  AND  USERID = #{userId}")
    List<Kinds> selectOtherKindsByParentIdAndUserIdWithNoUse(@Param("id") String id, @Param("userId") String userId);

    @Select("SELECT COUNT(KINDSPARENTID) FROM KINDS WHERE  KINDSPARENTID = #{id} AND USERID = #{userId}")
    int selectCountByKindsparentid(@Param("id") String id, @Param("userId") String userId);


    /**
     * 模糊匹配查询服务项
     *
     * @param name
     * @param code
     * @return
     */
    @Select("SELECT\n" +
            "KINDS.ID,\n" +
            "KINDS.SHOPINGNAME,\n" +
            "KINDS.KINDSPARENTID,\n" +
            "KINDS.IMGURL,\n" +
            "KINDS.SHOPINGCODE\n" +
            "FROM\n" +
            "KINDS\n" +
            "WHERE\n" +
            "(SHOPINGNAME LIKE  CONCAT('%',#{name},'%')  OR SHOPINGCODE LIKE  CONCAT('%',#{code},'%'))\n" +
            "AND\n" +
            "KINDS.KINDSPARENTID <> 1\n"
    )
    List<Kinds> selectKindsLikeXX(@Param("name") String name, @Param("code") String code);

    @Select("SELECT COUNT(KINDSPARENTID) FROM KINDS WHERE KINDS.KINDSPARENTID = #{id} AND KINDS.ISUSE = #{isUse}")
    int selectCountByKindsparentidAndIsUse(@Param("id") String id, @Param("isUse") int isUse);


    /**
     * 通过ID 查询 商品
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM KINDS WHERE ID=#{id}")
    Kinds selectById(@Param("id") String id);


    /**
     * 模糊匹配 店铺类的商品查询
     *
     * @param name
     * @param code
     * @param userId
     * @return
     */
    @Select("SELECT\n" +
            "KINDS.ID,\n" +
            "KINDS.SHOPINGNAME,\n" +
            "KINDS.KINDSPARENTID,\n" +
            "KINDS.IMGURL,\n" +
            "KINDS.SHOPINGCODE\n" +
            "FROM\n" +
            "KINDS\n" +
            "WHERE\n" +
            "(SHOPINGNAME LIKE  CONCAT('%',#{name},'%')  OR SHOPINGCODE LIKE  CONCAT('%',#{code},'%'))\n" +
            "AND\n" +
            "KINDS.KINDSPARENTID <> 1\n" +
            "AND KINDS.USERID=#{userId}"
    )
    List<Kinds> selectShopKindsLikeXX(@Param("name") String name, @Param("code") String code, @Param("userId") String userId);

}