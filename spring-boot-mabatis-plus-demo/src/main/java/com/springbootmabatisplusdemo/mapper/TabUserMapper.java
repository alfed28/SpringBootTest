package com.springbootmabatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springbootmabatisplusdemo.domain.TabUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname TabUserMapper
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 11:49
 * @Created by 石傲
 */
@Mapper
public interface  TabUserMapper extends BaseMapper<TabUser> {
    int test();
}
