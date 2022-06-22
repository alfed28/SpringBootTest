package com.shiao.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Classname UploadController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 11:40
 * @Created by 石傲
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostMapping("/test")
   public String test(String username,MultipartFile tx) throws IOException {
        //获取文件名
        String filename = tx.getOriginalFilename();
        if (tx.isEmpty()){
            return "file is empty";
        }
        //存放路径
        String path="D:\\IDEA\\SpringBoot\\springboot_freemarker\\src\\main\\resources\\static\\"+filename;
        tx.transferTo(new File(path));
        return "ok";
    }
    @GetMapping("/test2")
    public ResponseEntity<byte[]> downLoadTest(String fileName) throws IOException {
        File file=new File("D:\\IDEA\\SpringBoot\\springboot_freemarker\\src\\main\\resources\\static\\staticOIP-C.png");
        //设置响应头
        //内容类型是数据流
        //attachment附件形式
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", fileName);

        //数据封装成响应的实体ResponseEntity
        return  new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
}
