package com.xue.order.service.specialprice;

import com.xue.order.pojo.SpecialPrice;
import com.xue.order.pojo.SpecialShoping;
import com.xue.order.pojo.User;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SpecialPriceService {
    ResultBean insertSprcialPrie(@NonNull SpecialPrice specialPrice);

    ResultBean checkSprcialPrie(@NonNull SpecialPrice specialPrice);

    ResultBean<List<SpecialShoping>> selectAllSpecialPrice(@NonNull int page, @NonNull int pageSize);

    ResultBean<List<SpecialPrice>> selectAllUnUseSpecialPrice(@NonNull int page, @NonNull int pageSize);

    ResultBean<List<SpecialShoping>> selectUnUseShopingByUserId(@NonNull String userId, @NonNull String kindParentId, @NonNull int page, @NonNull int pageSize);

    ResultBean<SpecialPrice> selectSpecialPrice(@NonNull String kindsId);

    ResultBean<List<User>> getUserSpecialUnCheckByPage(@NonNull int page, @NonNull int pageSzie);

    ResultBean<List<SpecialShoping>> selectAllUseSpecialPrice(int page, int pageSize);

    ResultBean<SpecialShoping> selectSpecialPriceById(String id);

}
