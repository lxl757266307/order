package com.xue.order.util.tool;



import java.util.UUID;


public class TokenGenerate {

    public static String getToken() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


}
