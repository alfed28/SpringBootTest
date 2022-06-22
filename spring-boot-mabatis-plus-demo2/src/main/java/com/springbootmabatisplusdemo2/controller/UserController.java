package com.springbootmabatisplusdemo2.controller;

import com.springbootmabatisplusdemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:12
 * @Created by 石傲
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String userLogin(String username,String password){
        int i = userService.userLogin(username, password);
        if (i==0|| i==1)return "登陆失败";
        return "登陆成功";
    }

}
