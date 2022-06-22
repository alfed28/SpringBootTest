package com.shiao.domain;

import java.util.Date;

import lombok.Data;

import java.io.Serializable;

/**
 * (TabUser)实体类
 *
 * @author makejava
 * @since 2022-06-16 19:47:28
 */
@Data
public class TabUser implements Serializable {
    private static final long serialVersionUID = -72116754504854477L;

    private Integer uid;

    private String username;

    private String password;

    private String name;

    private Date birthday;

    private String sex;

    private String telephone;

    private String email;

    private String status;

    private String code;
}

