package com.springbootmabatisplusdemo3.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tab_route
 */
@TableName(value ="tab_route")
@Data
public class Route implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer rid;

    /**
     * 
     */
    private String rname;

    /**
     * 
     */
    private Double price;

    /**
     * 
     */
    private String routeintroduce;

    /**
     * 
     */
    private String rflag;

    /**
     * 
     */
    private String rdate;

    /**
     * 
     */
    private String isthemetour;

    /**
     * 
     */
    private Integer count;

    /**
     * 
     */
    private Integer cid;

    /**
     * 
     */
    private String rimage;

    /**
     * 
     */
    private Integer sid;

    /**
     * 
     */
    private String sourceid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}