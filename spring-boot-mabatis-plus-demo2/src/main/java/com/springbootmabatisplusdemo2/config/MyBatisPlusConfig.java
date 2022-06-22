package com.springbootmabatisplusdemo2.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyBatisPlusConfig
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:01
 * @Created by 石傲
 */
@Configuration
public class MyBatisPlusConfig {
    /**
     * 新版分页插件设置
     * @return
     */
    @Bean
    public MybatisPlusInterceptor getPaginationInnerInterceptor(){
        MybatisPlusInterceptor m=new MybatisPlusInterceptor();
        //分页插件
        m.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //乐观锁插件
        m.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return m;
    }
}
