package com.springbootmabatisplusdemo3.mapper;

import com.springbootmabatisplusdemo3.domain.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 27794
* @description 针对表【tab_test】的数据库操作Mapper
* @createDate 2022-06-21 09:55:52
* @Entity com.springbootmabatisplusdemo3.domain.Test
*/
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}




