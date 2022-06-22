package com.shiao.mapper;

import com.shiao.domain.TabUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TabUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-16 19:47:28
 */
@Mapper
public interface TabUserMapper {
    /**
     * 返回所有user
     * @author shiao
     * @date 2022/6/16 19:50
     * @return List<TabUser>
     */
    List<TabUser> selectAllUser();
}

