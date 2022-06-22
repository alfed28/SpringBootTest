package com.example.springbootmybatisplusdemo5.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisplusdemo5.domain.User;
import com.example.springbootmybatisplusdemo5.mapper.UserMapper;
import com.example.springbootmybatisplusdemo5.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_user】的数据库操作Service实现
* @createDate 2022-06-22 21:42:24
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public int userLogin(String username, String password) {
        password= SecureUtil.md5(password);
        User user = baseMapper.selectOneByUsername(username);
        if (user==null) return 0;
        if (!user.getPassword().equals(password)) return 1;
        return 2;
    }
}




