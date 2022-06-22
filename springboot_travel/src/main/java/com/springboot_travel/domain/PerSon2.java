package com.springboot_travel.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname PerSon
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/16 10:25
 * @Created by 石傲
 */
@Component
@Data
@ConfigurationProperties(prefix = "person")
public class PerSon2 {

    private String name;

    private int age;
}
