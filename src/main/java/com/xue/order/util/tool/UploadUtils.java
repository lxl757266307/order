package com.xue.order.util.tool;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.*;
import java.net.URLEncoder;

/**
 * @author 赵润泽
 */
public class UploadUtils {

    private UploadUtils() {
    }

    private static String AK = "hpGQprGR2UDh9YdmmUojfDKPN72WFjg6at6DvkkF";
    private static String SK = "_1Kbpc0gTSQMLSmKheBleQFPyYTICKO-T3XhV5KO";
    public static final String BUKECT = "object";

    public static final String URL = "http://img.jlyh.xyz";

    public static String upload2qiniu(InputStream inputStream, String extName, long expireInSeconds) throws Exception {
        if (expireInSeconds < 0) {
            throw new Exception("expireInSeconds is too short");
        }
        Configuration cfg = new Configuration(Zone.zone2());
        UploadManager uploadManager = new UploadManager(cfg);
        Auth auth = Auth.create(AK, SK);
        String upToken = auth.uploadToken(BUKECT);
        Response response = uploadManager.put(inputStream, TokenGenerate.getToken() + extName, upToken, null, null);
        DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
        String encodedFileName = URLEncoder.encode(putRet.key, "utf-8");
        String publicUrl = String.format("%s/%s", URL, encodedFileName);
//        return auth.privateDownloadUrl(publicUrl, expireInSeconds);
        return publicUrl;
    }


    public static String getPrivateUrl(String encodedFileName, long expireInSeconds) throws Exception {
        if (expireInSeconds < 0) {
            throw new Exception("expireInSeconds is too short");
        }
        Auth auth = Auth.create(AK, SK);
        String publicUrl = String.format("%s/%s", URL, encodedFileName);
        return auth.privateDownloadUrl(publicUrl, expireInSeconds);

//        return auth.privateDownloadUrl(URLEncoder.encode(url, "utf-8"),expireInSeconds);
    }


//    public static String getPrivateUrl(String url,long expireInSeconds) throws Exception {
//        if(expireInSeconds < 0){
//            throw new Exception("expireInSeconds is too short");
//        }
//        Auth auth = Auth.create(AK, SK);
//        return auth.privateDownloadUrl(URLEncoder.encode(url, "utf-8"),expireInSeconds);
//    }
}