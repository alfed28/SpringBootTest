package com.springbootmabatisplusdemo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootmabatisplusdemo3.domain.Test;
import com.springbootmabatisplusdemo3.service.TestService;
import com.springbootmabatisplusdemo3.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author 27794
* @description 针对表【tab_test】的数据库操作Service实现
* @createDate 2022-06-21 09:55:52
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

}




