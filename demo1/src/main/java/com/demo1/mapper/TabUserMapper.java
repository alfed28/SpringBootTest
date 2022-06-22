package com.demo1.mapper;

import com.demo1.domain.TabUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TabUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-14 17:05:17
 */
@Mapper
public interface TabUserMapper {

    /**
     * 增
     * @author shiao
     * @date 2022/6/14 17:10
     * @param user
     * @return Integer
     */

    Integer addUser(TabUser user);

    /**
     * 删
     * @author shiao
     * @date 2022/6/14 17:11
     * @param username
     * @return Integer
     */
    Integer deleteUser(String username);

    /**
     * 改
     * @author shiao
     * @date 2022/6/14 17:13
     * @param uid
     * @return Integer
     */
    Integer updateUser(Integer uid);

    /**
     * 查一个
     * @author shiao
     * @date 2022/6/14 17:13
     * @param username
     * @return TabUser
     */
    TabUser selectOneByNameTabUser(String username);

    /**
     * 通过性别查全部
     * @author shiao
     * @date 2022/6/14 17:15
     * @param sex
     * @return List<TabUser>
     */
    List<TabUser> selectAllBySexTabUsers(String sex);
}

