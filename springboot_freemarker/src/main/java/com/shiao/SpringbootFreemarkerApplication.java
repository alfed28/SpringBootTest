package com.shiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi//接口文档
@ServletComponentScan//可以扫描servlet类，和filter过滤器
public class SpringbootFreemarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFreemarkerApplication.class, args);
    }

}
