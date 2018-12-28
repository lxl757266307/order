package com.xue.order.util.bean;

public class ConstCode {
    /*** 数据为空*/
    public static final int NO_DATA = 100;
    /**正常*/
    public static final int NOMAL_CODE = 200;
    /**错误*/
    public static final int ERROR = -1;
    /**参数错误*/
    public static final int PARAMETER = -2;
    /**用户已注册，重复注册*/
    public static final int USER_HAD_REGISTER = -3;
    /**启用用户 注册时默认激活状态*/
    public static final int USER_ACTIVED = 1;
    /**冻结用户*/
    public static final int USER_LOCKED = 2;
    /**默认地址*/
    public static final int DEFAULT_ADDRESS = 1;
    /**普通地址*/
    public static final int NOMAL_ADDRESS = 0;
    /**是否启用 1 启用 0 不启用*/
    public static final int IS_USER=1;
    /**admin 超级管理员*/
    public static final String ADMIN="admin";
    /**已下单 未支付*/
    public static final int ORDER_COMMIN=0;
     /**下单 已支付*/
    public static final int ORDER_PAIED=1;
     /** 订单售后中*/
    public static final int ORDER_WAITING=2;
     /**订单 结束*/
    public static final int ORDER_END=3;
     /**用户类型 1由超级管理员注册 普通商户*/
    public static final int USER_TYPE_COMMERCIAL = 1;
     /**用户类型  2 由超级管理员注册 合作商*/
    public static final int USER_TYPE_COOPERATION = 2;
     /**用户类型 3 用户自主注册的账号类型*/
    public static final int USER_TYPE_NORMAL = 3;
    /**用户类型 4 超级管理员*/
    public static final int USER_TYPE_VIP = 4;



}
