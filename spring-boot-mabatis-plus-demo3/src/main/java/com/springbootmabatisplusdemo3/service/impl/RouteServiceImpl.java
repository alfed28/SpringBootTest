package com.springbootmabatisplusdemo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo3.domain.Route;
import com.springbootmabatisplusdemo3.service.RouteService;
import com.springbootmabatisplusdemo3.mapper.RouteMapper;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_route】的数据库操作Service实现
* @createDate 2022-06-21 11:16:19
*/
@Service
public class RouteServiceImpl extends ServiceImpl<RouteMapper, Route>
    implements RouteService{

}




