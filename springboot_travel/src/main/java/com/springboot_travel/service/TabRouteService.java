package com.springboot_travel.service;

import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.domain.TabRouteMessages;

import java.util.List;


/**
 * (TabRoute)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
public interface TabRouteService {

    /**
     * 通过人气排序 （降序）(收藏数量前4条)
     * @author shiao
     * @date 2022/6/7 14:30
     * @return List<TabRoute>
     */
    List<TabRoute> findRouteByCount();

    /**
     * 通过日期查最新4条（降序）
     * @author shiao
     * @date 2022/6/7 14:31
     * @return List<TabRoute>
     */

    List<TabRoute> findRouteByRdate();

    /**
     * 查询主题旅游，查询（最新）4条
     * @author shiao
     * @date 2022/6/7 14:33
     * @return List<TabRoute>
     */
    List<TabRoute> findRouteByTheme();

    /**
     * 分页查询所有国内游
     * @author shiao
     * @date 2022/6/7 20:14
     * @param pageNum 页码
     * @param pageSize 页数
     * @return PageInfo<TabRoute>
     */
    PageInfo<TabRoute> findAllRoute(int pageNum, int pageSize, int cid);

    /**
     * 搜索
     * @author shiao
     * @date 2022/6/8 14:31
     * @param text 文本
     * @return List<TabRoute>
     */
    PageInfo<TabRoute> findRoutPage(String text,int pageNum,int pageSize);

    /**
     * 根据cid分页查
     * @author shiao
     * @date 2022/6/8 14:40
     * @param cid 分类
     * @param pageNum 页码
     * @param pageSize 多少
     * @return R
     */
    PageInfo<TabRoute> findRoutPage2(Integer cid,int pageNum,int pageSize);
    /**
     * 显示详情页
     * @author shiao
     * @date 2022/6/9 15:38
     * @param rid 根据rid查找详细信息
     * @return TabRouteMessages
     */
    TabRouteMessages findOneMessage(int rid);

    /**
     * 查找所有收藏数大于0的
     * @author shiao
     * @date 2022/6/10 16:00
     * @return R
     */
    PageInfo<TabRoute> findAllCountMoreOne(String text,Integer minprice,Integer maxprice,Integer pageNum,Integer pageSize);
}
