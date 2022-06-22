package com.springbootmabatisplusdemo3.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName tab_test
 */
@TableName(value ="tab_test")
@Data
public class Test implements Serializable {
    /**
     *
     */
    @TableId
    private Long uid;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private Integer password;

    /**
     *
     */
    @TableLogic
    private int isdeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
