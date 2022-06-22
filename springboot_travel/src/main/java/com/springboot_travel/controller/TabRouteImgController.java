package com.springboot_travel.controller;

import com.springboot_travel.service.TabRouteImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (TabRouteImg)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@CrossOrigin
@RestController
@RequestMapping("/tabRouteImg")
public class TabRouteImgController {
    /**
     * 服务对象
     */
    @Autowired
    private TabRouteImgService tabRouteImgService;

}

