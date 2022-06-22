package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(scanBasePackages = {"com.springboot_travel"})
@MapperScan("com.springboot_travel.mapper")
@EnableOpenApi
public class SpringbootTravelApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTravelApplication.class, args);
    }

}
