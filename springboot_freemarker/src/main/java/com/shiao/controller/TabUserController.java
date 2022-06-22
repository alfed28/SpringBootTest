package com.shiao.controller;

import com.shiao.domain.TabUser;
import com.shiao.service.TabUserService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * (TabUser)表控制层
 *
 * @author makejava
 * @since 2022-06-16 19:47:28
 */
@Controller
@RequestMapping("/tabUser")
public class TabUserController {
    /**
     * 服务对象
     */
    @Autowired
    private TabUserService tabUserService;

    @GetMapping("/users")
    public ModelAndView allUser(){
        ModelAndView m = new ModelAndView();
        List<TabUser> tabUsers = tabUserService.selectAllUser();
        m.addObject("users",tabUsers);
        m.setViewName("userList");
        return m;
    }
}

