package com.xue.order.controller.specialprice;

import com.xue.order.pojo.OrderMain;
import com.xue.order.pojo.SpecialPrice;
import com.xue.order.pojo.SpecialShoping;
import com.xue.order.pojo.User;
import com.xue.order.service.specialprice.SpecialPriceService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;


@RestController
@RequestMapping("/specialPrice")
public class SpecialPriceController {

    @Autowired
    SpecialPriceService specialPriceService;

    @PostMapping(value = {"/insertSpecialPrice"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean insertSpecialPrice(@RequestBody SpecialPrice specialPrice) {
        return specialPriceService.insertSprcialPrie(specialPrice);
    }

    @PostMapping(value = {"/checkSprcialPrie"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean checkSprcialPrie(@RequestBody SpecialPrice specialPrice) {
        return specialPriceService.checkSprcialPrie(specialPrice);
    }

    /**
     * 分页获取 获取所有的特价商品
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = {"/selectAllSpecialPrice/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<List<SpecialShoping>> selectAllSpecialPrice(@PathVariable("page") int page,
                                                           @PathVariable("pageSize") int pageSize) {
        return specialPriceService.selectAllSpecialPrice(page, pageSize);
    }

    /**
     * 根据Id  查询特价商品的价格
     * @param id
     * @return
     */
    @GetMapping(value = {"/selectSpecialPriceById"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<SpecialShoping> selectSpecialPriceById(@RequestParam("id") String id) {
        return specialPriceService.selectSpecialPriceById(id);
    }


    /**
     * 获取所有没有被审核通过得 特价商品
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = {"/selectAllUnUseSpecialPrice/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<List<SpecialPrice>> selectAllUnUseSpecialPrice(@PathVariable("page") int page,
                                                              @PathVariable("pageSize") int pageSize) {
        return specialPriceService.selectAllUnUseSpecialPrice(page, pageSize);
    }

    /**
     * 分页获取所有得用户 及 用户未被审核得数量
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = {"/selectUserSpecialUnCheckByPage/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<List<User>> getUserSpecialUnCheckByPage(@PathVariable("page") int page,
                                                       @PathVariable("pageSize") int pageSize) {
        return specialPriceService.getUserSpecialUnCheckByPage(page, pageSize);
    }

    /**
     * 根据一级分类ID 用户ID分页获取 供货商没有被审核通过得特价商品
     *
     * @param kindParentId
     * @param userId
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping(value = {"/selectUnUseShopingByUserId/{kindParentId}/{userId}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<List<SpecialShoping>> selectUnUseShopingByUserId(
            @PathVariable("kindParentId") String kindParentId,
            @PathVariable("userId") String userId,
            @PathVariable("page") int page,
            @PathVariable("pageSize") int pageSize) {
        return specialPriceService.selectUnUseShopingByUserId(userId, kindParentId, page, pageSize);
    }

    @GetMapping(value = {"/selectAllUseSpecialPrice/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    ResultBean<List<SpecialShoping>> selectAllUseSpecialPrice(@PathVariable("page") int page,
                                                              @PathVariable("pageSize") int pageSize) {
        return specialPriceService.selectAllUseSpecialPrice(page, pageSize);
    }

}
