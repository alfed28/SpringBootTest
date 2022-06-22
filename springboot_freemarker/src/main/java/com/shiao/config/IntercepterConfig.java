package com.shiao.config;

import com.shiao.Intercepter.MyIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname IntercepterConfig
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 19:33
 * @Created by 石傲
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {
    @Bean
    public HandlerInterceptor getHandlerInterceptor(){
        return new MyIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getHandlerInterceptor())       //注册拦截器
                .addPathPatterns("/restful")       //拦截的路径
                .excludePathPatterns("/aaa/*","/bbb/*");      //不拦截的路径
    }
}
