package com.xue.order.service.order;

import com.xue.order.pojo.OrderLogistics;
import com.xue.order.pojo.OrderMain;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;

import java.util.List;

public interface OrderService {

    ResultBean insertOrder(@NonNull OrderMain orderMain);

    ResultBean updateOrder(@NonNull OrderMain orderMain);

    ResultBean deleteOrder(@NonNull String orderId, @NonNull String userId);

    ResultBean<OrderMain> getOrderMain(@NonNull String orderId);

    ResultBean<List<OrderMain>> getOrderMainList(@NonNull String userId, @NonNull int status);

    /*物流信息插入*/
    ResultBean insertOrderLogistics(@NonNull OrderLogistics orderLogistics);

    /*更新物流信息*/
    ResultBean updateOrderLogistics(@NonNull OrderLogistics orderLogistics);

    /*查询物流信息*/
    ResultBean<OrderLogistics> getOrderLogisticsInfo(@NonNull String orderId);


    ResultBean updateOrderStatus(@NonNull String orderId, @NonNull String userId, @NonNull int status);


}
