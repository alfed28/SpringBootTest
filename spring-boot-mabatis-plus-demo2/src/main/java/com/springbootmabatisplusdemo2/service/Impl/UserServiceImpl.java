package com.springbootmabatisplusdemo2.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo2.domain.User;
import com.springbootmabatisplusdemo2.mapper.UserMapper;
import com.springbootmabatisplusdemo2.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:10
 * @Created by 石傲
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public int userLogin(String username, String password) {
        User user = baseMapper.userLogin(username);
        if (user==null)return 0;
        if (!user.getPassword().equals(password)) return 1;
        return 2;
    }
}
