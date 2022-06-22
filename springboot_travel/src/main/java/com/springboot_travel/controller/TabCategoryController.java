package com.springboot_travel.controller;

import com.springboot_travel.service.TabCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (TabCategory)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:34:57
 */
@RestController
@RequestMapping("/tabCategory")
@CrossOrigin
public class TabCategoryController {
    /**
     * 服务对象
     */
    @Autowired
    private TabCategoryService tabCategoryService;

}

