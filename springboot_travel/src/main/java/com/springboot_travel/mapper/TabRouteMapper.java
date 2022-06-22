package com.springboot_travel.mapper;


import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.domain.TabRouteMessages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (TabRoute)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
//@Mapper
//@Repository
public interface TabRouteMapper {
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
     * 国内游，境外游
     * @author shiao
     * @date 2022/6/7 20:09
     * @return List<TabRoute>
     */
    List<TabRoute> findAllRoute(Integer cid);

    /**
     * 搜索
     * @author shiao
     * @date 2022/6/8 14:31
     * @param text 文本
     * @return List<TabRoute>
     */
    List<TabRoute> findRoutPage(String text);



    /**
     * 显示详情页
     * @author shiao
     * @date 2022/6/9 15:38
     * @param rid 根据rid查找详细信息
     * @return TabRouteMessages
     */
    TabRouteMessages findOneMessage(int rid);

    /**
     * 收藏数加一
     * @author shiao
     * @date 2022/6/9 21:26
     * @param rid 路线
     * @return int
     */
    int countAdd(Integer rid);

    /**
     * 收藏数减一
     * @author shiao
     * @date 2022/6/9 21:26
     * @param rid 路线
     * @return int
     */
    int countDelete(Integer rid);

    /**
     * 查找所有收藏数大于0的
     * @author shiao
     * @date 2022/6/10 16:00
     * @return R
     */
    List<TabRoute> findAllCountMoreOne(@Param("text") String text, @Param("minprice") Integer minprice, @Param("maxprice") Integer maxprice);
}

