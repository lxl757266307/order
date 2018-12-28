package com.xue.order.util.tool;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;

/**
 * @author 赵润泽
 * @since 1.8
 * @date 2018/3/12
 * @see https://gitee.com/Chris_Evans/boen_family.git
 */
public class EncryptionUtil {

    private final static String[] HEX_DIGITS = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    private final static String DES = "DES";

    public static String encryption(String data,String mode) throws Exception {
        if (StringUtils.isBlank(data)) {
            return "";
        }
        MessageDigest sha = MessageDigest.getInstance(mode);
        sha.update(data.getBytes());
        return byteArrayToHexString(sha.digest());
    }

    private static String byteToHexString(byte b) {
        int ret = b;
        if (ret < 0) {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return HEX_DIGITS[m] + HEX_DIGITS[n];
    }

    private static String byte2hex(byte[] bytes) {

        StringBuilder builder = new StringBuilder();
        String temp;
        for (byte aB : bytes) {
            temp = (Integer.toHexString(aB & 0XFF));
            if (temp.length() == 1) {
                builder.append(0).append(temp);
            } else {
                builder.append(temp);
            }
        }
        return builder.toString().toUpperCase();
    }

    private static byte[] hex2byte(byte[] b) {
        int i = 2;
        if ((b.length % i) != 0){
            throw new IllegalArgumentException("The length is not an even number");
        }
        byte[] b2 = new byte[b.length / i];
        for (int n = 0; n < b.length; n += i) {
            String item = new String(b, n, i);
            b2[n / i] = (byte) Integer.parseInt(item, 16);
        }
        return b2;
    }

    private static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(byteToHexString(aByte));
        }
        return sb.toString();
    }

    public static String encryptStr(byte[] src,byte[] key) throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        DESKeySpec desKeySpec = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        Cipher cipher = Cipher.getInstance(DES);
        cipher.init(Cipher.ENCRYPT_MODE,secretKey,secureRandom);
        return byte2hex(cipher.doFinal(src));
    }

    public static String decryptStr(byte[] src,byte[] key) throws Exception{
        SecureRandom secureRandom = new SecureRandom();
        DESKeySpec desKeySpec = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        Cipher cipher = Cipher.getInstance(DES);
        cipher.init(Cipher.DECRYPT_MODE,secretKey,secureRandom);
        return new String(cipher.doFinal(hex2byte(src)));
    }

    public static String MD5(String data) throws Exception {  //MD5算法实现
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString(item & 255 | 256).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) throws Exception {

    }
}
