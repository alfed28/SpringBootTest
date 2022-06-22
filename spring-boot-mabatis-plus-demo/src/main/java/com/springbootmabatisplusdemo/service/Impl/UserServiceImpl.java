package com.springbootmabatisplusdemo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo.domain.TabUser;
import com.springbootmabatisplusdemo.mapper.TabUserMapper;
import com.springbootmabatisplusdemo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 15:26
 * @Created by 石傲
 */
@Service
public class UserServiceImpl extends ServiceImpl<TabUserMapper, TabUser> implements IUserService {

    public void login(){
        baseMapper.test();
    }
}
