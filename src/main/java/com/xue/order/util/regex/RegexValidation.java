package com.xue.order.util.regex;

import org.springframework.lang.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static boolean validation(@NonNull String regex, @NonNull String value){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
