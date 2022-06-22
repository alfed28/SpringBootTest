package com.springboot_travel.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
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
@ImportResource(locations = {"classpath:*.xml"})
public class PerSon5 {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
}
