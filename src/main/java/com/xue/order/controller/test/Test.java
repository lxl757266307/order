package com.xue.order.controller.test;

import com.xue.order.util.bean.ResultBean;
import com.xue.order.util.tool.ResultUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


@RestController
@RequestMapping("/test")
public class Test {

    @PostMapping("/import")
    public ResultBean addUser(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        System.out.println("fileName=" + fileName);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(file.getInputStream());
            Object o = objectInputStream.readObject();
            System.out.println(o.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ResultUtils.success(fileName);
    }
}
