package com.xue.order.util.tool;


import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmsUtils {

    private SmsUtils(){}

    private static final String ACCOUNT = "xuelanhy";
    private static final String PASSWORD = "tXClE2";
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    private static final String[] hexDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static int send(String telephoneNumber,String code) throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String tkey = SIMPLE_DATE_FORMAT.format(new Date()).replace("-", "");
        messageDigest.update(PASSWORD.getBytes());
        byte[] bytes = messageDigest.digest();
        String md5pwd = byteArrayToHexString(bytes);
        messageDigest.update((md5pwd + tkey).getBytes());
        bytes = messageDigest.digest();
        String pwd = byteArrayToHexString(bytes);
        String sb = "http://api.zthysms.com/sendSms.do?" +
                "username=" + ACCOUNT +
                "&password=" + pwd +
                "&tkey=" + tkey +
                "&mobile=" + telephoneNumber +
                "&content=" + URLEncoder.encode("您的注册验证码是:" + code + ",请不要把验证码泄漏给其他人，如非本人请勿操作。【博恩之家】", "UTF-8");
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(sb);
        HttpResponse response = httpClient.execute(httpGet);
        StatusLine statusLine = response.getStatusLine();
        return statusLine.getStatusCode();
    }

    private static String byteToHexString(byte b) {
        int ret = b;
        if (ret < 0) {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return hexDigits[m] + hexDigits[n];
    }

    private static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(byteToHexString(aByte));
        }
        return sb.toString().toLowerCase();
    }
}
