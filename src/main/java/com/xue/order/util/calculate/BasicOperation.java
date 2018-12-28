package com.xue.order.util.calculate;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;


public class BasicOperation {

    /**
     *
     * 相加
     * @param val1 value1
     * @param val2 value2
     * @return BigDecimal
     */
    private static BigDecimal add(@NonNull String val1, @NonNull String val2){
        return new BigDecimal(val1).add(new BigDecimal(val2)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal add(@NonNull String...value){
        BigDecimal bigDecimal = new BigDecimal("0");
        for (String aValue : value) {
            bigDecimal = add(bigDecimal.toString(), aValue);
        }
        return bigDecimal;
    }

    /**
     *相减
     * @param val1 value1
     * @param val2 value2
     * @return BigDecimal
     */
    public static BigDecimal sub(@NonNull String val1,@NonNull String val2){
        return new BigDecimal(val1).subtract(new BigDecimal(val2)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    /**
     *
     * 相乘
     * @param val1 value1
     * @param val2 value2
     * @return BigDecimal
     */
    public static BigDecimal mul(@NonNull String val1,@NonNull String val2){
        return new BigDecimal(val1).multiply(new BigDecimal(val2)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 相除
     * @param val1 value1
     * @param val2 value2
     * @param scale 精度
     * @return BigDecimal
     */
    public static BigDecimal div(@NonNull String val1,@NonNull String val2,@NonNull int scale){
        return new BigDecimal(val1).divide(new BigDecimal(val2),scale,BigDecimal.ROUND_HALF_UP).setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 四舍五入
     * @param val value
     * @param scale 精度
     * @return BigDecimal
     */
    public static BigDecimal round(@NonNull String val,@NonNull int scale){
        return new BigDecimal(val).setScale(scale,BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {

    }
}
