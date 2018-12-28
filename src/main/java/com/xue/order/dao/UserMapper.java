package com.xue.order.dao;

import java.util.List;

import com.xue.order.pojo.User;
import com.xue.order.pojo.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @Select("SELECT * FROM USER  WHERE USERNAME = #{name}")
    User selectByName(@Param("name") String name);

    @Select("SELECT * FROM USER  WHERE PHONE = #{phone} AND PASSWORD = #{password}")
    User login(@Param("phone") String name, @Param("password") String password);

    @Select("SELECT * FROM USER  WHERE USERNAME = #{phone}")
    User selectByPhone(@Param("phone") String phone);

    @Update("UPDATE USER SET ONLINE=1 WHERE ID=#{id}")
    int updateUserOnline(@Param("id") String id);


    @Update("UPDATE USER SET ISFREE = #{isFree}  WHERE  ID = #{id} ")
    int lockUser(@Param("isFree") int isFree, @Param("id") String id);

    @Select("SELECT * FROM USER WHERE USERTYPE= #{type}")
    List<User> selectAllUser(@Param("type") int type);

    @Select("SELECT * FROM USER WHERE USERTYPE =1 OR USERTYPE =2")
    List<User> selectUserWithNoType();

    @Select("SELECT COUNT(ID) FROM USER WHERE USERTYPE =1 OR USERTYPE =2")
    int selectUserWithNoTypeCount();

    @Select("SELECT COUNT(USER.ID) FROM USER , KINDS  WHERE USER.ID= #{id} AND KINDS.USERID = #{id} AND KINDS.ISUSE=0")
    int selectUnCheckKindsCount(@Param("id") String id);

    @Select("SELECT COUNT(USERTYPE) FROM USER WHERE USERTYPE= #{type}")
    int selectCountByType(@Param("type") int type);

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User selectUserById(@Param("id") String id);

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User selectUserInfoById(@Param("id") String id);

    /**
     * 查询所有得供货商
     *
     * @return
     */
    @Select("SELECT   ID,USERNAME,PHONE,ADDRESS,IMGURL FROM USER WHERE USERTYPE IN (1,2) ")
    List<User> selectAllUserByPage();

    @Update("UPDATE USER SET IMGURL = #{imgUrl} WHERE ID = #{id}")
    int updateUserPhoto(@Param("imgUrl") String imgUrl, @Param("id") String id);


    /**
     * 根据一级分类的ID 查询 用户
     *
     * @param kindId
     * @return
     */
    @Select("SELECT ID,USERNAME,ADMINNAME,PHONE,ADDRESS,IMGURL ,KINDID FROM USER WHERE  KINDID= #{kindId} ")
    List<User> selectUserByKindId(@Param("kindId") String kindId);


    /**
     * 模糊匹配 用户名字查询 用户
     *
     * @param name
     * @return
     */
    @Select("SELECT ID,USERNAME,ADMINNAME,PHONE,ADDRESS,IMGURL FROM USER WHERE ADMINNAME LIKE  CONCAT('%',#{name},'%')")
    List<User> selectUserLikeXX(@Param("name") String name);
}