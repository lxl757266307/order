package com.xue.order.service.unit;

import com.xue.order.pojo.Unit;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;

import java.util.List;

public interface UnitService {

    ResultBean insertUnit(@NonNull Unit unit);

    ResultBean deleteUnit(@NonNull String id);

    ResultBean updateUnit(@NonNull Unit unit);

    ResultBean<List<Unit>> selectUnit();

    ResultBean<Unit> selectUnitById(String id);

}
