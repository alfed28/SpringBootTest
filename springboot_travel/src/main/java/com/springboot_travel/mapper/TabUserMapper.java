package com.springboot_travel.mapper;


import com.springboot_travel.domain.TabUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (TabUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
//@Mapper
//@Repository
public interface TabUserMapper {

    /**
     * 登陆
     * @author shiao
     * @date 2022/6/6 20:04
     * @param username 用户名
     * @return TabUser
     */
    TabUser userLogin(String username);

    /**
     * 注册
     * @author shiao
     * @date 2022/6/6 19:14
     * @param user 用户
     * @return TabUser
     */
    int userReg(TabUser user);

    /**
     * 通过邮箱激活
     * @author shiao
     * @date 2022/6/8 11:30
     * @param username 用户名
     * @return int
     */
    int userJiHuo(String username);

    /**
     * 通过用户名查id
     * @author shiao
     * @date 2022/6/9 21:18
     * @param username
     * @return int
     */
    int findUidByUsername(String username);

}

