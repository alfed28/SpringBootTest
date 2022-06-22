package com.springbootmabatisplusdemo2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springbootmabatisplusdemo2.domain.User;
import com.springbootmabatisplusdemo2.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @Classname UserService
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:09
 * @Created by 石傲
 */
public interface UserService extends IService<User> {
    int userLogin(String username,String password);
}
