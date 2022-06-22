package com.springbootmabatisplusdemo2.mapper;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

import com.springbootmabatisplusdemo2.domain.Favorite;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 27794
* @description 针对表【tab_favorite】的数据库操作Mapper
* @createDate 2022-06-20 23:12:04
* @Entity com.springbootmabatisplusdemo2.domain.Favorite
*/
public interface FavoriteMapper extends BaseMapper<Favorite> {


    int deleteByUidAndRid(@Param("uid") Integer uid, @Param("rid") Integer rid);

    int insertSelective(Favorite favorite);


}




