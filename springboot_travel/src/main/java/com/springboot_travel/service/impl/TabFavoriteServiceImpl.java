package com.springboot_travel.service.impl;

import cn.hutool.core.date.DateTime;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabFavorite;
import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.mapper.TabFavoriteMapper;
import com.springboot_travel.mapper.TabRouteMapper;
import com.springboot_travel.mapper.TabUserMapper;
import com.springboot_travel.service.TabFavoriteService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (TabFavorite)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@Service
@Slf4j
public class TabFavoriteServiceImpl implements TabFavoriteService {
    @Resource
    private TabFavoriteMapper tabFavoriteMapper;

    @Resource
    private TabUserMapper tabUserMapper;

    @Resource
    private TabRouteMapper tabRouteMapper;

    /**
     * 通过用户名和rid查看用户收藏
     * @author shiao
     * @date 2022/6/9 20:03
     * @param username 用户名
     * @param rid 旅游路线Route
     * @return int 1，代表收藏，0，代表未收藏
     */
    @Override
    public int findFavoriteOneByUsernameAndRid(String username, Integer rid) {
        TabFavorite one = tabFavoriteMapper.findFavoriteOneByUsernameAndRid(username, rid);
        if (one!=null) return 1;
        return 0;
    }

    /**
     * 收藏
     * @author shiao
     * @date 2022/6/9 21:16
     * @param username 用户名
     * @param rid 旅游路线
     * @return int
     */
    @Override
    public int favoriteAddByUidAndRid(String username,Integer rid) {
        int uid = tabUserMapper.findUidByUsername(username);
        Date date = new DateTime();
        tabRouteMapper.countAdd(rid);

        System.err.println(uid+""+rid+""+date);
        return tabFavoriteMapper.favoriteAddByUidAndRid(uid, rid, date);
    }

    /**
     * 删除收藏
     * @author shiao
     * @date 2022/6/9 21:16
     * @param username 用户名
     * @param rid 旅游路线
     * @return int
     */
    @Override
    public int favoriteDeleteByUidAndRid(String username, Integer rid) {
        int uid = tabUserMapper.findUidByUsername(username);
        Date date=new DateTime();
        tabRouteMapper.countDelete(rid);

        return tabFavoriteMapper.favoriteDeleteByUidAndRid(uid,rid,date);
    }

    /**
     * 我的收藏
     * @author shiao
     * @date 2022/6/10 10:28
     * @param username 用户名
     * @param pageNum
     * @param pageSize
     * @return PageInfo<TabFavorite>
     */

    @Override
    public PageInfo<TabRoute> findUserAllFavorite(String username, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        //List<Integer> userAllFavorite = tabFavoriteMapper.findUserAllFavorite(username);
        ////通过rid查所有收藏详细信息
        ///*
        // * 如果没有rid直接返回空
        // */
        //log.info(userAllFavorite.toString());
        //if (userAllFavorite.size()==0) return new PageInfo<>(new ArrayList<>());
        //List<TabRoute> userFavoriteRoute = tabFavoriteMapper.findUserFavoriteRoute(userAllFavorite);
        List<TabRoute> route02 = tabFavoriteMapper.findUserFavoriteRoute02(username);
        return new PageInfo<>(route02);

    }
}
