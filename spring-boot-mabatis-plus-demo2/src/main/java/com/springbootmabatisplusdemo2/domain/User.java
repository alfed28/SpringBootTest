package com.springbootmabatisplusdemo2.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.springbootmabatisplusdemo2.enums.SexEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/20 17:06
 * @Created by 石傲
 */
@Data
//@TableName("tab_user")
public class User {
    private static final long serialVersionUID = -80597589440685405L;

    //@TableId(value = "uid")指定在表中对应的属性
    @TableId
    private Integer uid;

    private String username;

    private String password;

    private String name;

    private Date birthday;

    //private String sex;//用枚举来表示性别
    private SexEnum sex;

    private String telephone;

    private String email;

    //@Version//标注乐观锁版本号字段
    private String status;

    private String code;

    //逻辑删除，此时的删除操作会将isDeleted改为1，
    @TableLogic
    private Integer isdeleted;
}
