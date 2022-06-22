package com.springboot_travel.mapper;


import cn.hutool.core.date.DateTime;
import com.springboot_travel.domain.TabFavorite;
import com.springboot_travel.domain.TabRoute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * (TabFavorite)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
//@Mapper
//@Repository
public interface TabFavoriteMapper {

    /**
     * 通过用户名和rid查看用户收藏
     * @author shiao
     * @date 2022/6/9 20:03
     * @param username 用户名
     * @param rid 旅游路线Route
     * @return TabFavorite
     */
    TabFavorite findFavoriteOneByUsernameAndRid(@Param("username") String username, @Param("rid") Integer rid);

    /**
     * 通过uid和rid收藏信息
     * @author shiao
     * @date 2022/6/9 21:09
     * @param uid 用户id
     * @param rid 旅游路线
     * @return int
     */
    int favoriteAddByUidAndRid(@Param("uid") Integer uid, @Param("rid") Integer rid, @Param("date") Date date);

    /**
     * 通过uid和rid删除收藏信息
     * @author shiao
     * @date 2022/6/9 21:31
     * @param uid
     * @param rid
     * @param date
     * @return int
     */
    int favoriteDeleteByUidAndRid(@Param("uid") Integer uid, @Param("rid") Integer rid, @Param("date") Date date);

    ///**
    // * 通过username查找所有收藏的rid
    // * @author shiao
    // * @date 2022/6/9 22:26
    // * @param username 用户名
    // * @return List<TabFavorite>
    // */
    //List<Integer> findUserAllFavorite(String username);
    //
    ///**
    // * 通过rid查到所有收藏路线
    // * @author shiao
    // * @date 2022/6/10 11:04
    // * @param rids
    // * @return List<TabRoute>
    // */
    //
    //List<TabRoute> findUserFavoriteRoute(@Param("rids") List<Integer> rids);

    /**
     * 通过username查找route
     * @author shiao
     * @date 2022/6/12 16:41
     * @param username
     * @return List<TabRoute>
     */

    List<TabRoute> findUserFavoriteRoute02(String username);
}

