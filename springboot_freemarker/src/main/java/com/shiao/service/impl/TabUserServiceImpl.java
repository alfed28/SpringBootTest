package com.shiao.service.impl;

import com.shiao.domain.TabUser;
import com.shiao.mapper.TabUserMapper;
import com.shiao.service.TabUserService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * (TabUser)表服务实现类
 *
 * @author makejava
 * @since 2022-06-16 19:47:28
 */
@Service
public class TabUserServiceImpl implements TabUserService {
    @Autowired
    private TabUserMapper tabUserMapper;

    /**
     * 查询所有用户
     * @author shiao
     * @date 2022/6/16 19:52
     * @return List<TabUser>
     */
    @Override
    public List<TabUser> selectAllUser() {
        return tabUserMapper.selectAllUser();
    }
}
