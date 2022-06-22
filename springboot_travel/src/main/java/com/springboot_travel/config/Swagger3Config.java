package com.springboot_travel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Classname Swagger3Config
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 21:19
 * @Created by 石傲
 */
@Configuration
public class Swagger3Config {
    @Bean
    public Docket getDocket(){
        return  new Docket(DocumentationType.OAS_30).apiInfo(getApiInfo());
    }

    @Bean
    public ApiInfo getApiInfo(){
        return   new ApiInfoBuilder()
                .title("swaggerTest")
                .description("test1111111111111111111111")
                .contact(new Contact("shiao","http://www.baidu.com","2779496452@qq.com"))
                .version("v1.0")
                .build();
    }
}
