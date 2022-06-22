package com.shiao.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname RestfulController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 19:17
 * @Created by 石傲
 */
@CrossOrigin
@RestController
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping
    public String getTest(String restfulName){
        System.out.println("get");
        return "get ok";
    }
    @PostMapping
    public String postTest(){
        System.out.println("post");
        return "post ok";
    }
    @PutMapping
    public String putTest(){
        System.out.println("put");
        return "put ok";
    }
    @DeleteMapping
    public String deleteTest(){
        System.out.println("delete");
        return "delete ok";
    }



}
