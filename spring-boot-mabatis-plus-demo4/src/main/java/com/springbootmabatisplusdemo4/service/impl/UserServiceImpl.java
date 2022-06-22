package com.springbootmabatisplusdemo4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo4.domain.User;
import com.springbootmabatisplusdemo4.service.UserService;
import com.springbootmabatisplusdemo4.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_user】的数据库操作Service实现
* @createDate 2022-06-22 21:07:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




