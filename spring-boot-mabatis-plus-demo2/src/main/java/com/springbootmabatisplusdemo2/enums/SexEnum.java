package com.springbootmabatisplusdemo2.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Classname SexEnum
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 22:21
 * @Created by 石傲
 */
@Getter
public enum SexEnum {
    MALE(1,"男"),
    FEMALE(0,"女");
    @EnumValue//将注解所标识的属性的值存储到数据库
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
