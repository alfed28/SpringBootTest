package com.example.springbootmybatisplusdemo5.controller;

import com.example.springbootmybatisplusdemo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/22 21:44
 * @Created by 石傲
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public String test01(String username,String password){
        int i = service.userLogin(username, password);
        if (i==0)return "无此用户";
        if (i==1)return "密码错误";
        return "登陆成功";

    }
}
