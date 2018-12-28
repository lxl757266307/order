package com.xue.order.service.user;

import com.xue.order.pojo.User;
import com.xue.order.util.bean.ResultBean;
import org.springframework.lang.NonNull;

import java.util.List;

public interface UserService {

    ResultBean<User> login(@NonNull User user);

    ResultBean<User> getUserInfo(@NonNull String id);

    ResultBean<User> register(@NonNull User user);

    ResultBean<User> checkUserRepeat(@NonNull String phone);

    ResultBean<User> seletUserByName(@NonNull String name);

    ResultBean<User> seletUserByPhone(@NonNull String phone);


    ResultBean<User> lockingUser(@NonNull String id);

    ResultBean<User> unlockUser(@NonNull String id);

    ResultBean<List<User>> getUserByPage(@NonNull int type, @NonNull int page, @NonNull int pageSzie);

    ResultBean<List<User>> getUserUnCheckKindsByPage(@NonNull int page, @NonNull int pageSzie);

    ResultBean<List<User>> selectAllUserByPage(@NonNull int page, @NonNull int pageSzie);

    ResultBean<User> updateUserPhoto(@NonNull String imgUrl, @NonNull String id);

    ResultBean<List<User>> selectUserBykindId(@NonNull String kindid);

    ResultBean<List<User>> selectUserByLikeXX(@NonNull String name);
}
