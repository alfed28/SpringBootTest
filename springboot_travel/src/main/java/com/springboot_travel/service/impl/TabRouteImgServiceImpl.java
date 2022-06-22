package com.springboot_travel.service.impl;

import com.springboot_travel.mapper.TabRouteImgMapper;
import com.springboot_travel.service.TabRouteImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (TabRouteImg)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@Service
public class TabRouteImgServiceImpl implements TabRouteImgService {
    @Autowired
    private TabRouteImgMapper tabRouteImgMapper;


}
