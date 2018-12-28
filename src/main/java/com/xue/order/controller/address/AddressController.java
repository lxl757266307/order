package com.xue.order.controller.address;

import com.xue.order.pojo.Address;
import com.xue.order.service.address.AddressService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = {"/select/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Address>> selectAddressById(@PathVariable String id) {
        return addressService.selectAllAddressByUserId(id);
    }

    @RequestMapping(value = {"/insert"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean insertAddress(Address address) {
        return addressService.insertAddress(address);
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean updateAddress(Address address) {
        return addressService.updateAddress(address);
    }

    @RequestMapping(value = {"/setDefaultAddress/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean setDefaultAddress(@PathVariable("id") String id) {
        return addressService.setDefaultAddress(id);
    }

    @RequestMapping(value = {"/deleteAddressById/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean deleteAddressById(@PathVariable("id") String id) {
        return addressService.deleteAddressById(id);
    }
}
