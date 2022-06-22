package com.springboot_travel.controller;

import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.domain.TabRouteMessages;
import com.springboot_travel.service.TabRouteService;
import com.springboot_travel.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * (TabRoute)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@CrossOrigin
@RestController
@RequestMapping("/route")
@Slf4j
public class TabRouteController {
    /**
     * 服务对象
     */
    @Autowired
    private TabRouteService tabRouteService;

    /**
     * 通过人气排序 （降序）(收藏数量前4条)
     * @author shiao
     * @date 2022/6/7 14:30
     * @return List<TabRoute>
     */
    @RequestMapping("/count")
    public R findRouteByCount(){
        return R.ok(tabRouteService.findRouteByCount());
    }

    /**
     * 通过日期查最新4条（降序）
     * @author shiao
     * @date 2022/6/7 14:31
     * @return List<TabRoute>
     */
    @RequestMapping("/rdate")
    public R findRouteByRdate(){
        return R.ok(tabRouteService.findRouteByRdate());
    }

    /**
     * 查询主题旅游，查询（最新）4条
     * @author shiao
     * @date 2022/6/7 14:33
     * @return List<TabRoute>
     */
    @RequestMapping("/theme")
    public R findRouteByTheme(){
        return R.ok(tabRouteService.findRouteByTheme());
    }

    /**
     * 分页查询所有国内游
     * @author shiao
     * @date 2022/6/7 20:14
     * @param pageNum 页码
     * @param pageSize 页数
     * @return PageInfo<TabRoute>
     */
    @GetMapping("/china")
    public R findAllRoute(Integer pageNum,Integer pageSize){
        int cid=5;
        PageInfo<TabRoute> allRoute = tabRouteService.findAllRoute(pageNum, pageSize,cid);
        return R.ok(allRoute);
    }
    /**
     * 分页查询所有境外游
     * @author shiao
     * @date 2022/6/7 20:14
     * @param pageNum 页码
     * @param pageSize 页数
     * @return PageInfo<TabRoute>
     */
    @GetMapping("/other")
    public R findAllOthers(Integer pageNum,Integer pageSize){
        int cid=4;
        PageInfo<TabRoute> allRoute = tabRouteService.findAllRoute(pageNum, pageSize,cid);
        return R.ok(allRoute);
    }

    /**
     * 搜索（模糊）
     * @author shiao
     * @date 2022/6/8 14:40
     * @param text 搜啥
     * @param pageNum 页码
     * @param pageSize 多少
     * @return R
     */
    @GetMapping("/list")
    public R findRoutPage(String text,int pageNum,int pageSize){
        PageInfo<TabRoute> routPage = tabRouteService.findRoutPage(text, pageNum, pageSize);
        return R.ok(routPage);
    }

    /**
     * 根据cid分页查
     * @author shiao
     * @date 2022/6/8 14:40
     * @param cid 分类
     * @param pageNum 页码
     * @param pageSize 多少
     * @return R
     */
    @GetMapping("/list2")
    public R findRoutPage2(Integer cid,int pageNum,int pageSize){
        PageInfo<TabRoute> routPage = tabRouteService.findRoutPage2(cid, pageNum, pageSize);
        return R.ok(routPage);
    }

    /**
     * 显示详情页
     * @author shiao
     * @date 2022/6/9 15:38
     * @param rid 根据rid查找详细信息
     * @return TabRouteMessages
     */
    @GetMapping("/messages")
    public R findOneMessages(Integer rid){
        TabRouteMessages oneMessage = tabRouteService.findOneMessage(rid);
        log.info(oneMessage.toString());
        return R.ok(oneMessage);
    }

    /**
     * 查找所有收藏数大于0的
     * @author shiao
     * @date 2022/6/10 16:00
     * @return R
     */
    @GetMapping("/allcount")
    public R findAllCountMoreOne(String text,Integer minprice,Integer maxprice,Integer pageNum,Integer pageSize){
        PageInfo<TabRoute> allCountMoreOne =
                tabRouteService.findAllCountMoreOne(text,minprice,maxprice,pageNum, pageSize);
        log.info(allCountMoreOne.toString());
        return R.ok(allCountMoreOne);
    }
}

