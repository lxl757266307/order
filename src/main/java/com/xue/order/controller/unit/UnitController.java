package com.xue.order.controller.unit;

import com.xue.order.pojo.Unit;
import com.xue.order.service.unit.UnitService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    UnitService unitService;

    @RequestMapping(value = {"/insert"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean insertUnit(@RequestBody Unit unit) {
        return unitService.insertUnit(unit);
    }

    @RequestMapping(value = {"/delete/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean delete(@PathVariable("id") String id) {
        return unitService.deleteUnit(id);
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean delete(@RequestBody Unit unit) {
        return unitService.updateUnit(unit);
    }

    @RequestMapping(value = {"/select"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Unit>> selectUnit() {
        return unitService.selectUnit();
    }


    @RequestMapping(value = {"/select/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<Unit> selectUnitById(@PathVariable("id") String id) {
        return unitService.selectUnitById(id);
    }
}
