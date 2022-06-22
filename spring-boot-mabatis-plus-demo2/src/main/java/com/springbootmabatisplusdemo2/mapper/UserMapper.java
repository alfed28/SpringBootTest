package com.springbootmabatisplusdemo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.springbootmabatisplusdemo2.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:07
 * @Created by 石傲
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 登陆
     * @author shiao
     * @date 2022/6/20 17:20
     * @param username
     * @return User
     */
    User userLogin(String username);

    /**
     * 通过性别查询用户，并分页
     * @author shiao
     * @date 2022/6/20 21:36
     * @param page
     * @return Page<User>
     */
    Page<User> selectpage(@Param("page") Page<User> page);
}
