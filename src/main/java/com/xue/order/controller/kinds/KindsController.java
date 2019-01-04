package com.xue.order.controller.kinds;

import com.xue.order.pojo.Kinds;
import com.xue.order.service.kinds.KindsService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kinds")
public class KindsController {

    @Autowired
    KindsService kindsService;

    /**
     * @param isUse 1 代表已经通过审核  0 代表 未通过审核
     * @param id    ==KINDS_PARENT_ID      id=1 代表一级分类
     * @return
     */
    @RequestMapping(value = {"/selectTopKinds/{isUse}/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectKindsByParentId(@PathVariable int isUse, @PathVariable String id) {
        return kindsService.selectFirstKindsByParentId(isUse, id);
    }

    @RequestMapping(value = {"/selectKindsByCode/{code}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean selectKindsByCode(@PathVariable("code") String code) {
        return kindsService.selectKindsByCode(code);
    }


    @RequestMapping(value = {"/selectFirstKindsWithUserId/{userId}/{isUse}/{id}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectFirstKindsByParentIdAndUserId(@PathVariable String userId, @PathVariable int isUse, @PathVariable String id, @PathVariable int page, @PathVariable int pageSize) {
        return kindsService.selectFirstKindsByParentIdAndUserId(userId, isUse, id, page, pageSize);
    }

    /**
     * 根据一级分类ID 获取所有的2级分类
     *
     * @param isUse    1 代表已通过审核 启用状态
     * @param id
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = {"/selectOtherKinds/{isUse}/{id}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectOtherKindsByParentId(@PathVariable int isUse, @PathVariable String id, @PathVariable int page, @PathVariable int pageSize) {
        return kindsService.selectOtherKindsByParentId(isUse, id, page, pageSize);
    }

    @RequestMapping(value = {"/selectOtherKindsWithNoUse/{userId}/{parentId}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectOtherKindsByParentId(@PathVariable String userId, @PathVariable String parentId, @PathVariable int page, @PathVariable int pageSize) {
        return kindsService.selectOtherKindsByParentIdAndUserId(userId, parentId, page, pageSize);
    }


    @PostMapping(value = {"/insert"})
    public @ResponseBody
    ResultBean insertKinds(@RequestBody Kinds kinds) {
        System.out.println("kinds==" + kinds);
        return kindsService.insertKinds(kinds);
    }

    @PostMapping(value = {"/updateUse"})
    public @ResponseBody
    ResultBean updateKinds(@RequestBody Kinds kinds) {
        return kindsService.updateKindsById(kinds);
    }

    /**
     * 更新新品的状态
     *
     * @param kinds
     * @return
     */
    @PostMapping(value = {"/updateNew"})
    public @ResponseBody
    ResultBean updateNew(@RequestBody Kinds kinds) {
        return kindsService.updateNewById(kinds);
    }

    @PostMapping(value = {"/updateKindsSale"})
    public @ResponseBody
    ResultBean updateKindsSale(@RequestBody Kinds kinds) {
        return kindsService.updateKindsSaleAfterById(kinds);
    }

    @PostMapping(value = {"/updateKindsSpecial"})
    public @ResponseBody
    ResultBean updateKindsSpecial(@RequestBody Kinds kinds) {
        return kindsService.updateKindsSpecialOfferById(kinds);
    }

    @RequestMapping(value = {"/delete/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean deleteKinds(@PathVariable("id") String id) {
        return kindsService.deleteKindsById(id);
    }

    /**
     * 模糊匹配搜索数据
     *
     * @param content
     * @return
     */
    @RequestMapping(value = {"/seletByLikeXX"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean selectKindsByLikeXX(@RequestParam("content") String content) {
        return kindsService.selectOtherKindsByLike(content);
    }

    /**
     * 通过ID 查询 商品
     *
     * @param id
     * @return
     */

    @RequestMapping(value = {"/selectKindsById"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean selectKindsById(@RequestParam("id") String id) {
        return kindsService.selectById(id);
    }


    /**
     * 查询店铺内所有的 可使用 商品
     *
     * @param userId
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = {"/selectShopKinds/{userId}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectShopKinds(@PathVariable String userId, @PathVariable int page, @PathVariable int pageSize) {
        return kindsService.selectShopKinds(userId, page, pageSize);
    }


    /**
     * 模糊匹配查询店铺内的 商品
     *
     * @param userId
     * @param content
     * @return
     */
    @RequestMapping(value = {"/selectShopKindsLikeXX"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean<List<Kinds>> selectShopKindsLikeXX(@RequestParam String userId, @RequestParam("content") String content) {
        return kindsService.selectShopKindsLikeXX(userId, content);
    }


    @RequestMapping(value = {"/selectNewKinds"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<Kinds>> selectNewKinds(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {
        return kindsService.selectNewKinds(page, pageSize);
    }

}
