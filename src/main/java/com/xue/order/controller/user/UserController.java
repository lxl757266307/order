package com.xue.order.controller.user;

import com.xue.order.pojo.User;
import com.xue.order.service.user.UserService;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = {"/lock/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> lockUser(@PathVariable String id) {
        return userService.lockingUser(id);
    }

    @RequestMapping(value = {"/unLock/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> unLockUser(@PathVariable String id) {
        return userService.unlockUser(id);
    }

    @RequestMapping(value = {"/updateImgUrl/{imgUrl}/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> updateUserPhoto(@PathVariable String imgUrl, @PathVariable String id) {
        return userService.updateUserPhoto(imgUrl, id);
    }

    @RequestMapping(value = {"/selectUserById/{id}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> getUserByInfo(@PathVariable String id) {
        return userService.getUserInfo(id);
    }

    @RequestMapping(value = {"/selectByName/{name}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> getUserByName(@PathVariable String name) {
        return userService.seletUserByName(name);
    }

    @RequestMapping(value = {"/selectByPhone/{phone}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> selectUserByPhone(@PathVariable String phone) {
        return userService.seletUserByPhone(phone);
    }

    @RequestMapping(value = {"/checkUserRepeat/{phone}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<User> checkUserRepeat(@PathVariable String phone) {
        return userService.checkUserRepeat(phone);
    }

    @PostMapping(value = {"/login"})
    public @ResponseBody
    ResultBean<User> login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping(value = {"/register"}, consumes = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody
    ResultBean<User> register(@RequestBody User user) {

        System.out.println("user=" + user);
        return userService.register(user);
    }


    @RequestMapping(value = {"/byPage/{userType}/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<User>> selectUserByPage(@PathVariable("userType") int type, @PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {

        return userService.getUserByPage(type, page, pageSize);
    }

    /**
     * 查询所有的供货商
     *
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = {"/selectAllUserByPage/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<User>> selectAllUserByPage(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {

        return userService.selectAllUserByPage(page, pageSize);
    }


    /**
     * 获取用户未被审核的商品
     *
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = {"/unCheckKinds/byPage/{page}/{pageSize}"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<User>> selectUserUnCheckKindsByPage(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {
        return userService.getUserUnCheckKindsByPage(page, pageSize);
    }

    /**
     * 根据一i分类 的ID 获取不同  经营范围的 用户
     *
     * @param kindId
     * @return
     */

    @RequestMapping(value = {"/byKindsId"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<User>> selectUserBykindId(@RequestParam("kindId") String kindId) {
        return userService.selectUserBykindId(kindId);
    }


    /**
     * 模糊匹配 搜索用户
     *
     * @param name
     * @return
     */
    @RequestMapping(value = {"/byLikeXX"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody
    ResultBean<List<User>> selectUserByLikeXX(@RequestParam("name") String name) {
        return userService.selectUserByLikeXX(name);
    }
}
