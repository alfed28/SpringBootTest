package com.huadian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.huadian")

public class HuadianApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuadianApplication.class, args);
    }

}
