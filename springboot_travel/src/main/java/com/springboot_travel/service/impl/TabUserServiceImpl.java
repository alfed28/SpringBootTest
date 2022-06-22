package com.springboot_travel.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.springboot_travel.domain.TabUser;
import com.springboot_travel.mapper.TabUserMapper;
import com.springboot_travel.service.TabUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (TabUser)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@Service
public class TabUserServiceImpl implements TabUserService {
    @Autowired
    private TabUserMapper tabUserMapper;

    /**
     * 登陆
     * @author shiao
     * @date 2022/6/6 20:07
     * @param username 用户名
     * @param password 密码
     * @return int
     */
    @Override
    public int userLogin(String username, String password) {
        password=SecureUtil.md5(password);
        TabUser user = tabUserMapper.userLogin(username);
        if (user==null) return 0;
        if (!user.getPassword().equals(password)) return 1;
        if (!user.getStatus().equals("0")) return 2;
        return 3;
    }

    /**
     * 注册
     * @author shiao
     * @date 2022/6/6 19:19
     * @param user 用户
     * @return int
     */
    @Override
    public int userReg(TabUser user) {
        user.setStatus("1");
        user.setPassword(SecureUtil.md5(user.getPassword()));
        return tabUserMapper.userReg(user);
    }

    /**
     * 激活
     * @author shiao
     * @date 2022/6/8 11:33
     * @param username
     * @return int
     */
    @Override
    public int userJiHuo(String username) {
       return tabUserMapper.userJiHuo(username);
    }
}
