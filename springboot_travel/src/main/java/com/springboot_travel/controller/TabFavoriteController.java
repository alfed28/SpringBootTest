package com.springboot_travel.controller;


import com.github.pagehelper.PageInfo;
import com.springboot_travel.domain.TabRoute;
import com.springboot_travel.service.TabFavoriteService;
import com.springboot_travel.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (TabFavorite)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:34:58
 */
@CrossOrigin
@RestController
@RequestMapping("/favorite")
@Slf4j
public class TabFavoriteController {
    /**
     * 服务对象
     */
    @Autowired
    private TabFavoriteService tabFavoriteService;

    /**
     * 查看是否收藏
     * @author shiao
     * @date 2022/6/9 19:58
     * @param username 通过用户名查uid
     * @param rid 通过uid和rid查看是否收藏
     * @return R
     */
    @GetMapping("/one")
    public R findFavoriteOne(String username, Integer rid){
        int one = tabFavoriteService.findFavoriteOneByUsernameAndRid(username, rid);
         return R.ok(one);
    }

    /**
     * 收藏
     * @author shiao
     * @date 2022/6/9 21:16
     * @param username 用户名
     * @param rid 旅游路线
     * @return int
     */
    @GetMapping("/add")
    public R favoriteAddByUsernameAndRid(String username,Integer rid){
        int one = tabFavoriteService.favoriteAddByUidAndRid(username, rid);
        if (one==0)return R.fail("收藏失败");
        return R.ok("收藏成功");
    }

    /**
     * 删除收藏
     * @author shiao
     * @date 2022/6/9 21:30
     * @param username
     * @param rid
     * @return R
     */
    @GetMapping("/delete")
    public R favoriteDeleteByUsernameAndRid(String username,Integer rid){
        int i = tabFavoriteService.favoriteDeleteByUidAndRid(username, rid);
        if (i==0)return R.fail("删除收藏失败");
        return R.ok("删除收藏成功");
    }
    /**
     * 我的收藏
     * @author shiao
     * @date 2022/6/9 22:32
     * @param username 用户名
     * @param pageNum 页码
     * @param pageSize 数量
     * @return R
     */
    @GetMapping("/list")
    public R findUserAllFavorite(String username,Integer pageNum,Integer pageSize){
        PageInfo<TabRoute> userAllFavorite = tabFavoriteService.findUserAllFavorite(username, pageNum, pageSize);
        return R.ok(userAllFavorite);
    }
}

