package com.shiao.service;

import com.shiao.domain.TabUser;

import java.util.List;

/**
 * (TabUser)表服务接口
 *
 * @author makejava
 * @since 2022-06-16 19:47:28
 */
public interface TabUserService {

    /**
     * 查询所有用户
     * @author shiao
     * @date 2022/6/16 19:52
     * @return List<TabUser>
     */
    List<TabUser> selectAllUser();
}
