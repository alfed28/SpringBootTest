package com.springbootmabatisplusdemo2.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo2.domain.Favorite;
import com.springbootmabatisplusdemo2.service.FavoriteService;
import com.springbootmabatisplusdemo2.mapper.FavoriteMapper;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_favorite】的数据库操作Service实现
* @createDate 2022-06-20 23:12:04
*/
@Service
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite>
    implements FavoriteService{

}




