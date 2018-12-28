package com.xue.order.service.logistics;

import com.xue.order.pojo.Logistics;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;

import java.util.List;

public interface LogisticsService {

    ResultBean insertLogistcs(@NonNull Logistics logistics);

    ResultBean updateLogistcs(@NonNull Logistics logistics);

    ResultBean deletetLogistcs(@NonNull String id);

    ResultBean<List<Logistics>> selectLogistcs();
}
