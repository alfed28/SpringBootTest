package com.demo1.controller;

import com.demo1.domain.TabUser;
import com.demo1.service.TabUserService;
import com.demo1.util.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * (TabUser)表控制层
 *
 * @author makejava
 * @since 2022-06-14 17:05:16
 */
@RestController
@RequestMapping("/tabUser")
public class TabUserController {
    /**
     * 服务对象
     */
    @Autowired
    private TabUserService tabUserService;

    @PutMapping("/add")
    public R addUser(TabUser user){
        Integer integer = tabUserService.addUser(user);
        return R.ok(integer);
    }

}

