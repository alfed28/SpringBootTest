package com.springbootmabatisplusdemo3.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyBatistaPlusConfig
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/21 10:05
 * @Created by 石傲
 */
@Configuration
public class MyBatistaPlusConfig {

    @Bean
    public MybatisPlusInterceptor getMybatisPlusInterceptor(){
        MybatisPlusInterceptor m = new MybatisPlusInterceptor();
        m.addInnerInterceptor(new PaginationInnerInterceptor());
        return m;
    }
}
