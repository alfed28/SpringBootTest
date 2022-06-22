package com.springbootmabatisplusdemo2.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tab_favorite
 */
@TableName(value ="tab_favorite")
@Data
public class Favorite implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer rid;

    /**
     * 
     */
    @TableId
    private Integer uid;

    /**
     * 
     */
    private Date date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}