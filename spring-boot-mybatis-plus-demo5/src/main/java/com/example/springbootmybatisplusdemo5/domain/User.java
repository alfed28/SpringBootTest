package com.example.springbootmybatisplusdemo5.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @TableName tab_user
 */
@TableName(value ="tab_user")
@Data
public class User implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer uid;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Date birthday;

    /**
     *
     */
    private String sex;

    /**
     *
     */
    private String telephone;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String code;

    /**
     *
     */
    @TableLogic
    private int isdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
