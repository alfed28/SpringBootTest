package com.springbootmabatisplusdemo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo3.domain.Favorite;
import com.springbootmabatisplusdemo3.service.FavoriteService;
import com.springbootmabatisplusdemo3.mapper.FavoriteMapper;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_favorite】的数据库操作Service实现
* @createDate 2022-06-21 11:15:45
*/
@Service
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite>
    implements FavoriteService{

}




