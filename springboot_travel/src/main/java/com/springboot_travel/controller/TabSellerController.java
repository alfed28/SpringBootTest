package com.springboot_travel.controller;

import com.springboot_travel.service.TabSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (TabSeller)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@CrossOrigin
@RestController
@RequestMapping("/tabSeller")
public class TabSellerController {
    /**
     * 服务对象
     */
    @Autowired
    private TabSellerService tabSellerService;

}

