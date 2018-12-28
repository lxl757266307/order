package com.xue.order.dao;

import com.xue.order.pojo.Address;
import com.xue.order.pojo.AddressExample;

import java.util.List;

import com.xue.order.util.bean.ResultBean;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AddressMapper {
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    @Select("SELECT * FROM ADDRESS WHERE USER_ID = #{userId} ")
    List<Address> selectAllAddressByUserId(@Param("userId") String userId);

    @Delete("DELETE FROM ADDRESS WHERE ID = #{addressId}")
    int deleteAddressById(@Param("addressId") String addressId);

    @Update("UPDATE ADDRESS SET IS_DEFAULT = #{isDefault} WHERE ID = #{id}")
    int setDefaultAddress(@Param("isDefault") int isDefault, @Param("id") String id);


}