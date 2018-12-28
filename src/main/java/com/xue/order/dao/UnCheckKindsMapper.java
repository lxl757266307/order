package com.xue.order.dao;

import com.xue.order.pojo.UnCheckKinds;
import com.xue.order.pojo.UnCheckKindsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnCheckKindsMapper {
    int countByExample(UnCheckKindsExample example);

    int deleteByExample(UnCheckKindsExample example);

    int insert(UnCheckKinds record);

    int insertSelective(UnCheckKinds record);

    List<UnCheckKinds> selectByExample(UnCheckKindsExample example);

    int updateByExampleSelective(@Param("record") UnCheckKinds record, @Param("example") UnCheckKindsExample example);

    int updateByExample(@Param("record") UnCheckKinds record, @Param("example") UnCheckKindsExample example);
}