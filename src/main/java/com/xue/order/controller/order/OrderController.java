package com.xue.order.controller.order;

import com.xue.order.pojo.OrderLogistics;
import com.xue.order.pojo.OrderMain;
import com.xue.order.service.order.OrderService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = {"/insertOrder"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean insertOrder(@RequestBody OrderMain orderMain) {
        return orderService.insertOrder(orderMain);
    }

    @RequestMapping(value = {"/updateOrder"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean updateOrder(@RequestBody OrderMain orderMain) {
        return orderService.updateOrder(orderMain);
    }

    @RequestMapping(value = {"/deleteOrder/{orderId}/{userId}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean deleteOrder(@PathVariable("orderId") String orderId, @PathVariable("userId") String userId) {
        return orderService.deleteOrder(orderId, userId);
    }

    @RequestMapping(value = {"/getOrder/{orderId}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<OrderMain> getOrder(@PathVariable("orderId") String orderId) {
        return orderService.getOrderMain(orderId);
    }

    @RequestMapping(value = {"/getOrderList/{userId}/{status}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<OrderMain>> getOrderList(@PathVariable("userId") String userId, @PathVariable("status") int status) {
        return orderService.getOrderMainList(userId, status);
    }

    @RequestMapping(value = {"/insertOrderLogistics"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean insertOrderLogistics(@RequestBody OrderLogistics orderLogistics) {
        return orderService.insertOrderLogistics(orderLogistics);
    }

    @RequestMapping(value = {"/updateOrderLogistics"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean updateOrderLogistics(@RequestBody OrderLogistics orderLogistics) {
        return orderService.updateOrderLogistics(orderLogistics);
    }


    @RequestMapping(value = {"/getOrderLogisticsInfo/{orderId}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<OrderLogistics> getOrderLogisticsInfo(@PathVariable("orderId") String orderId) {
        return orderService.getOrderLogisticsInfo(orderId);
    }


    @RequestMapping(value = {"/updateOrderStatus/{orderId}/{userId}/{status}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean updateOrderStatus(@PathVariable("orderId") String orderId, @PathVariable("userId") String userId, @PathVariable("status") int status) {
        return orderService.updateOrderStatus(orderId, userId, status);
    }

}
