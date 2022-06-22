package com.example.springbootmybatisplusdemo5.service;

import com.example.springbootmybatisplusdemo5.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 27794
* @description 针对表【tab_user】的数据库操作Service
* @createDate 2022-06-22 21:42:24
*/
public interface UserService extends IService<User> {

    /**
     * 登陆
     * @author shiao
     * @date 2022/6/22 21:51
     * @param username 用户名
     * @param password 密码
     * @return int
     */
    int userLogin(String username,String password);
}
