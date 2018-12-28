package com.xue.order.util.tool;


import org.apache.commons.lang3.StringUtils;

public class EmptyUtils {

    public static boolean isEmpty(String ... values){
       for(String str : values){
           if(StringUtils.isBlank(str)){
               return true;
           }
       }
       return false;
    }

    public static boolean numberValidate(String...value){
        for(String str : value){
            if(str != null){
                if(str.startsWith("-") || str.startsWith("00") || str.startsWith(".")){
                    return false;
                }
            }
        }
        return true;
    }
}
