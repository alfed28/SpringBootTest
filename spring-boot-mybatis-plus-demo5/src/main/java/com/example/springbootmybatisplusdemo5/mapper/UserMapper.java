package com.example.springbootmybatisplusdemo5.mapper;
import org.apache.ibatis.annotations.Param;

import com.example.springbootmybatisplusdemo5.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 27794
* @description 针对表【tab_user】的数据库操作Mapper
* @createDate 2022-06-22 21:42:24
* @Entity com.springbootmabatisplusdemo5.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectOneByUsername(@Param("username") String username);
}




