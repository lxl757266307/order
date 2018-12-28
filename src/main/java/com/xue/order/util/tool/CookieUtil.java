package com.xue.order.util.tool;

import javax.servlet.http.Cookie;
import java.util.Arrays;


public class CookieUtil {


    public static String getCookieValue(Cookie[] cookies,String cookieName){
        for(Cookie cookie : Arrays.asList(cookies)){
            if(cookieName.equals(cookie.getName())){
                return cookie.getValue();
            }
        }
        return null;
    }
}
