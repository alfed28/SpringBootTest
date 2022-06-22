package com.springboot_travel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.domain.TabRouteMessages;
import com.springboot_travel.mapper.TabRouteMapper;
import com.springboot_travel.service.TabRouteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (TabRoute)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@Service
@Slf4j
public class TabRouteServiceImpl implements TabRouteService {
    @Autowired
    private TabRouteMapper tabRouteMapper;


    /**
     * 通过人气排序 （降序）(收藏数量前4条)
     * @author shiao
     * @date 2022/6/7 14:30
     * @return List<TabRoute>
     */
    @Override
    public List<TabRoute> findRouteByCount() {
        return tabRouteMapper.findRouteByCount();
    }

    /**
     * 通过日期查最新4条（降序）
     * @author shiao
     * @date 2022/6/7 14:31
     * @return List<TabRoute>
     */
    @Override
    public List<TabRoute> findRouteByRdate() {
        return tabRouteMapper.findRouteByRdate();
    }

    /**
     * 查询主题旅游，查询（最新）4条
     * @author shiao
     * @date 2022/6/7 14:33
     * @return List<TabRoute>
     */
    @Override
    public List<TabRoute> findRouteByTheme() {
        return tabRouteMapper.findRouteByTheme();
    }

    /**
     * 分页查询所有国内游
     * @author shiao
     * @date 2022/6/7 20:14
     * @param pageNum 页码
     * @param pageSize 页数
     * @return PageInfo<TabRoute>
     */
    @Transactional
    @Override
    public PageInfo<TabRoute> findAllRoute(int pageNum, int pageSize, int cid) {
        PageHelper.startPage(pageNum, pageSize);
        List<TabRoute> allRoute = tabRouteMapper.findAllRoute(cid);
        return new PageInfo<>(allRoute);
    }
    /**
     * 搜索
     * @author shiao
     * @date 2022/6/8 14:37
     * @param text 文本
     * @param pageNum 页码
     * @param pageSize 每页多少
     * @return PageInfo<TabRoute>
     */
    @Override
    public PageInfo<TabRoute> findRoutPage(String text, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TabRoute> routPage = tabRouteMapper.findRoutPage(text);
        return new PageInfo<>(routPage);
    }

    /**
     * 搜索
     * @author shiao
     * @date 2022/6/8 14:37
     * @param cid 文本
     * @param pageNum 页码
     * @param pageSize 每页多少
     * @return PageInfo<TabRoute>
     */
    @Override
    public PageInfo<TabRoute> findRoutPage2(Integer cid, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TabRoute> routPage = tabRouteMapper.findAllRoute(cid);
        return new PageInfo<>(routPage);
    }

    /**
     * 显示详情页
     * @author shiao
     * @date 2022/6/9 15:38
     * @param rid 根据rid查找详细信息
     * @return TabRouteMessages
     */
    @Override
    public TabRouteMessages findOneMessage(int rid) {
        return tabRouteMapper.findOneMessage(rid);
    }

    /**
     * 查找所有收藏数大于0的
     * @author shiao
     * @date 2022/6/10 16:00
     * @return list
     */
    @Override
    public PageInfo<TabRoute> findAllCountMoreOne(String text,Integer minprice,Integer maxprice,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(tabRouteMapper.findAllCountMoreOne(text, minprice, maxprice));
    }
}
