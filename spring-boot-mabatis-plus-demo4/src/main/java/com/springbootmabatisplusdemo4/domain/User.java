package com.springbootmabatisplusdemo4.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Classname User
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/21 14:43
 * @Created by 石傲
 */
@Data
@Entity
@Table(name = "tab_test")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    private String username;

    private Integer password;

    private Integer isdeleted;
}
