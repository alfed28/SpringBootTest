package com.springboot_travel.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
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
public class PerSon {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
}
