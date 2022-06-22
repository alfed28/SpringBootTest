package com.springbootmabatisplusdemo.comfig;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MybatisPlusConfig
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 16:00
 * @Created by 石傲
 */
@Configuration
public class MybatisPlusConfig {
    /**
     * 新版分页插件设置
     * @return
     */
    @Bean
    public MybatisPlusInterceptor getPaginationInnerInterceptor(){
        MybatisPlusInterceptor  interceptor=new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return  interceptor;
    }
}
