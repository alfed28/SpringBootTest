package com.springboot_travel.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (TabCategory)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:34:58
 */
@Data
public class TabCategory implements Serializable {
    private static final long serialVersionUID = -63634524236506109L;

    private Integer cid;

    private String cname;


}

