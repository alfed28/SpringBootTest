package com.springboot_travel.service;


import com.springboot_travel.domain.TabUser;

/**
 * (TabUser)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
public interface TabUserService {

    /**
     * 登陆
     * @author shiao
     * @date 2022/6/6 20:06
     * @param username 用户名
     * @param password 密码
     * @return int
     */
    int userLogin(String username,String password);

    /**
     * 注册
     * @author shiao
     * @date 2022/6/6 19:18
     * @param user 用户
     * @return int
     */
    int userReg(TabUser user);

    /**
     * 激活
     * @author shiao
     * @date 2022/6/8 11:32
     * @param username
     * @return int
     */
    int userJiHuo(String username);

}
