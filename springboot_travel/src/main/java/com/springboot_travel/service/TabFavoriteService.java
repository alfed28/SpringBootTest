package com.springboot_travel.service;

import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabRoute;

/**
 * (TabFavorite)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
public interface TabFavoriteService {

    /**
     * 通过用户名和rid查看用户收藏
     * @author shiao
     * @date 2022/6/9 20:03
     * @param username 用户名
     * @param rid 旅游路线Route
     * @return TabFavorite
     */
    int findFavoriteOneByUsernameAndRid(String username,Integer rid);

    /**
     * 收藏
     * @author shiao
     * @date 2022/6/9 21:16
     * @param username 用户名
     * @param rid 旅游路线
     * @return int
     */
    int favoriteAddByUidAndRid(String username,Integer rid);

    /**
     * 删除收藏
     * @author shiao
     * @date 2022/6/9 21:16
     * @param username 用户名
     * @param rid 旅游路线
     * @return int
     */
    int favoriteDeleteByUidAndRid(String username,Integer rid);

    /**
     * 收藏页
     * @author shiao
     * @date 2022/6/9 22:26
     * @param username 用户名
     * @return List<TabFavorite>
     */
    PageInfo<TabRoute> findUserAllFavorite(String username, Integer pageNum, Integer pageSize);
}
