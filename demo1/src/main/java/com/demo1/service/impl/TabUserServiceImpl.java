package com.demo1.service.impl;

import com.demo1.domain.TabUser;
import com.demo1.mapper.TabUserMapper;
import com.demo1.service.TabUserService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * (TabUser)表服务实现类
 *
 * @author makejava
 * @since 2022-06-14 17:05:17
 */
@Service
public class TabUserServiceImpl implements TabUserService {
    @Autowired
    private TabUserMapper tabUserMapper;

    /**
     * 增
     * @author shiao
     * @date 2022/6/14 17:10
     * @param user
     * @return Integer
     */
    @Override
    public Integer addUser(TabUser user) {
        return tabUserMapper.addUser(user);
    }

    /**
     * 删
     * @author shiao
     * @date 2022/6/14 17:11
     * @param username
     * @return Integer
     */
    @Override
    public Integer deleteUser(String username) {
        return tabUserMapper.deleteUser(username);
    }

    /**
     * 改
     * @author shiao
     * @date 2022/6/14 17:13
     * @param uid
     * @return Integer
     */
    @Override
    public Integer updateUser(Integer uid) {
        return tabUserMapper.updateUser(uid);
    }

    /**
     * 查一个
     * @author shiao
     * @date 2022/6/14 17:13
     * @param username
     * @return TabUser
     */
    @Override
    public TabUser selectOneByNameTabUser(String username) {
        return tabUserMapper.selectOneByNameTabUser(username);
    }

    /**
     * 通过性别查全部
     * @author shiao
     * @date 2022/6/14 17:15
     * @param sex
     * @return List<TabUser>
     */
    @Override
    public List<TabUser> selectAllBySexTabUsers(String sex) {
        return tabUserMapper.selectAllBySexTabUsers(sex);
    }
}
