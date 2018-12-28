package com.xue.order.controller.logistics;

import com.xue.order.pojo.Logistics;
import com.xue.order.service.logistics.LogisticsService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    @Autowired
    LogisticsService logisticsService;

    @RequestMapping(value = {"/select"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Logistics>> selectLogistics() {
        return logisticsService.selectLogistcs();
    }

    @RequestMapping(value = {"/delete/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean deleteLogistics(@NonNull @PathVariable("id") String id) {
        return logisticsService.deletetLogistcs(id);
    }

    @PostMapping(value = "/insert")
    public @ResponseBody
    ResultBean insertLogistics(@NonNull @RequestBody Logistics logistics) {
        return logisticsService.insertLogistcs(logistics);
    }

    @PostMapping(value = "/update")
    public @ResponseBody
    ResultBean updateLogistics(@NonNull @RequestBody Logistics logistics) {
        return logisticsService.updateLogistcs(logistics);
    }

}
