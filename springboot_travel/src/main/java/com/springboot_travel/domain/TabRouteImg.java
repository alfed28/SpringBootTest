package com.springboot_travel.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (TabRouteImg)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@Data
public class TabRouteImg implements Serializable {
    private static final long serialVersionUID = -25334017888083431L;

    private Integer rgid;

    private Integer rid;

    private String bigpic;

    private String smallpic;


}

