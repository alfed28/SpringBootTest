package com.springboot_travel.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (TabSeller)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@Data
public class TabSeller implements Serializable {
    private static final long serialVersionUID = -80532166926407626L;

    private Integer sid;

    private String sname;

    private String consphone;

    private String address;


}

