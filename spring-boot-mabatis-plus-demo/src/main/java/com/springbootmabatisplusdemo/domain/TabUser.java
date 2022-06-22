package com.springbootmabatisplusdemo.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (TabUser)实体类
 *
 * @author makejava
 * @since 2022-06-20 11:48:19
 */
@Data
@TableName("tab_user")
public class TabUser implements Serializable {
    private static final long serialVersionUID = -80597589440685405L;

    @TableId(type = IdType.AUTO)
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

