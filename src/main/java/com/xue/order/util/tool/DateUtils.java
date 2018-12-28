package com.xue.order.util.tool;


import org.springframework.lang.NonNull;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {
    private SimpleDateFormat dateFormat;


    private String delimiter;

    public DateUtils(@NonNull String format, @NonNull String delimiter) {
        this.dateFormat = new SimpleDateFormat(format);
        this.delimiter = delimiter;
    }

    public Integer getCurrentYear() {
        String format = dateFormat.format(new Date());
        String[] split = format.split(delimiter);
        return Integer.parseInt(split[0]);
    }

    public Integer getCurrentMonth() {
        String format = dateFormat.format(new Date());
        String[] split = format.split(delimiter);
        return Integer.parseInt(split[1]);
    }

    public Integer getCurrentDay() {
        String format = dateFormat.format(new Date());
        String[] split = format.split(delimiter);
        return Integer.parseInt(split[2]);
    }

    public Integer getCurrentHour() {
        String format = dateFormat.format(new Date());
        String[] split = format.split(delimiter);
        return Integer.parseInt(split[3]);
    }

    public Integer getCurrentMinute() {
        String format = dateFormat.format(new Date());
        String[] split = format.split(delimiter);
        return Integer.parseInt(split[4]);
    }

    public List<Map<String, Integer>> getDateInterval(@NonNull int startYear,
                                                      @NonNull int startMonth,
                                                      @NonNull int endYear,
                                                      @NonNull int endMonth) {
        if (startYear > endYear || startMonth < 1 || startMonth > 12 || endMonth < 1 || endMonth > 12) {
            throw new RuntimeException("parameter is wrong");
        }
        List<Map<String, Integer>> list = new ArrayList<>();
        if (startYear == endYear) {
            if (startMonth > endMonth) {
                throw new RuntimeException("parameter is wrong");
            }
            for (int i = startMonth; i <= endMonth; ++i) {
                Map<String, Integer> map = new HashMap<>();
                map.put(startYear + "", i);
                list.add(map);
            }
        } else {
            for (int i = startYear; i <= endYear; ++i) {
                if (i == startYear) {
                    for (int j = startMonth; j < 13; ++j) {
                        Map<String, Integer> map = new HashMap<>();
                        map.put(i + "", j);
                        list.add(map);
                    }
                } else if (i == endYear) {
                    for (int j = 1; j <= endMonth; ++j) {
                        Map<String, Integer> map = new HashMap<>();
                        map.put(i + "", j);
                        list.add(map);
                    }
                } else {
                    for (int j = 1; j < 13; ++j) {
                        Map<String, Integer> map = new HashMap<>();
                        map.put(i + "", j);
                        list.add(map);
                    }
                }
            }
        }
        return list;
    }

    public boolean dateValidate(Integer startYear, Integer startMonth, Integer endYear, Integer endMonth) {
        if (startYear == null || startMonth == null || endYear == null || endMonth == null) {
            return false;
        }
        if (endYear < startYear) {
            return false;
        }
        if (startYear.equals(endYear)) {
            return startMonth <= endMonth;
        }
        return true;
    }
}