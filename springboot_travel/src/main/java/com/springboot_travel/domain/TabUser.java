package com.springboot_travel.domain;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.io.Serializable;

/**
 * (TabUser)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@Data
@ApiModel(value = "用户实体类")
public class TabUser implements Serializable {
    private static final long serialVersionUID = -86005004471307499L;

    @ApiModelProperty(name = "uid",value = "用户编号")
    private Integer uid;

    @ApiModelProperty(name = "username",value = "用户名")
    @NotNull(message = "姓名不为空")
    private String username;

    @ApiModelProperty(name = "password",value = "密码")
    private String password;

    @ApiModelProperty(name = "name",value = "昵称")
    private String name;

    @ApiModelProperty(name = "birthday",value = "生日")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    @ApiModelProperty(name = "sex",value = "性别")
    private String sex;

    @ApiModelProperty(name = "telephone",value = "电话号码")
    private String telephone;

    @ApiModelProperty(name = "email",value = "邮箱")
    @NotNull(message = "邮箱不为空")
    @Email(message = "邮箱格式不对")
    private String email;

    private String status;

    private String code;


}

