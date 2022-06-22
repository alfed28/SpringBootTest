package com.springboot_travel.service.impl;

import com.springboot_travel.mapper.TabSellerMapper;
import com.springboot_travel.service.TabSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (TabSeller)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@Service
public class TabSellerServiceImpl implements TabSellerService {
    @Autowired
    private TabSellerMapper tabSellerMapper;


}
