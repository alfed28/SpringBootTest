package com.springboot_travel.service.impl;

import com.springboot_travel.mapper.TabCategoryMapper;
import com.springboot_travel.service.TabCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (TabCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:34:58
 */
@Service
public class TabCategoryServiceImpl implements TabCategoryService {
    @Autowired
    private TabCategoryMapper tabCategoryMapper;


}
