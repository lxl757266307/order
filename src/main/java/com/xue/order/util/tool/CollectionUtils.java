package com.xue.order.util.tool;


import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;


public class CollectionUtils {

    private CollectionUtils(){}

    public static List subList(List list, int count){
        if(list == null || list.size() == 0 || count == 0){
            return null;
        }
        if(count >= list.size()){
            List list1 = new ArrayList(1);
            list1.add(list);
            return list1;
        }
        double srcSize = list.size();
        double subCount = Math.ceil(srcSize / count);
        int a = (int) subCount;
        List lists = new ArrayList<>(a);
        for(int i = 0; i < a - 1;++i){
            List subList = new ArrayList<>(count);
            for(int j = i * count;j < (i + 1)*count;++j){
                subList.add(list.get(j));
            }
            lists.add(subList);
        }
        int lastListSize = (int) (srcSize - ((a - 1) * count));
        List lastList = new ArrayList(lastListSize);
        for(int i = (a - 1) * count;i < srcSize; ++i){
            lastList.add(list.get(i));
        }
        lists.add(lastList);
        return lists;
    }

    public static String[] list2Array(List<String> list){
        if(list == null || list.size() <= 0){
            throw new RuntimeException("parameter is wrong");
        }
        String[] array = new String[list.size()];
        for(int i = 0;i < array.length;++i){
            array[i] = list.get(i);
        }
        return array;
    }

    public static List<Long> stringList2LongList(List<String> src) throws Exception {
        List<Long> dest = new ArrayList<>(src.size());
        for(String str : src){
            try{
                Long aLong = Long.valueOf(str);
                dest.add(aLong);
            }catch (NumberFormatException e){
                throw new Exception(e.getMessage());
            }
        }
        return dest;
    }

    public static String getSqlIn(@NonNull List list){
        if(list.size() == 0){
            return null;
        }
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for(int i = 0;i < list.size();i++){
            builder.append(list.get(i));
            if(i != list.size() -  1){
                builder.append(",");
            }
        }
        builder.append(")");
        return builder.toString();
    }

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(7L);
        list.add(1L);
        list.add(1L);
        list.add(4L);
        list.add(6L);
        list.add(1L);
        String sqlIn = getSqlIn(list);
        System.out.println(sqlIn);
    }
}
