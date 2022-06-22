package com.springboot_travel.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (TabRoute)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@Data
public class TabRoute implements Serializable {
    private static final long serialVersionUID = -49447089287447467L;

    private Integer rid;

    private String rname;

    private Object price;

    private String routeintroduce;

    private String rflag;

    private String rdate;

    private String isthemetour;

    private Integer count;

    private Integer cid;

    private String rimage;

    private Integer sid;

    private String sourceid;


}

