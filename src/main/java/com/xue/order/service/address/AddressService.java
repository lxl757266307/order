package com.xue.order.service.address;

import com.xue.order.pojo.Address;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;

import java.util.List;


public interface AddressService {

    ResultBean insertAddress(@NonNull Address address);

    ResultBean updateAddress(@NonNull Address address);

    ResultBean<List<Address>> selectAllAddressByUserId(@NonNull String userId);

    ResultBean setDefaultAddress(@NonNull String id);

    ResultBean deleteAddressById(@NonNull String id);
}
