package com.xue.order.controller.upload;

import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import com.xue.order.util.tool.UploadUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadController {


    @PostMapping(value = "/img")
    public ResultBean<String> uploadImage(@RequestParam("file") MultipartFile file) {
        if (file == null) {
            return ResultUtils.parameterErr();
        }
        try {
            String url = UploadUtils.upload2qiniu(file.getInputStream(), file.getOriginalFilename(), 1);
            System.out.println("url==" + url);
            return ResultUtils.successData(url);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.err();
        }
    }

}
