package com.xue.order.util.tool;



import org.springframework.lang.NonNull;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class NumberFormatUtils {

    public static String formatToPercentage(@NonNull double number, @NonNull int scale){
        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        numberFormat.setMinimumFractionDigits(scale);
        return numberFormat.format(number);
    }

    public static int getTotalFee(String total){
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = total.split("\\.");
        for(String s :split){
            stringBuilder.append(s);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static List<Double> parseDouble(String...value){
        List<Double> doubles = new ArrayList<>(value.length);
        for(String s : value){
            double v = Double.parseDouble(s);
            doubles.add(v);
        }
        return doubles;
    }
    //判断字符串转化为数字是否成功
    public  static boolean isNumeric1(String s) {
        if (s != null && !"".equals(s.trim()))
            return s.matches("-?[0-9]*[0-9]*");
        else
            return false;
    }
}
