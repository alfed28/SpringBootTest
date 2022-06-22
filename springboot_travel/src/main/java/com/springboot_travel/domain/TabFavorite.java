package com.springboot_travel.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (TabFavorite)实体类
 *
 * @author makejava
 * @since 2022-06-06 11:34:59
 */
@Data
public class TabFavorite implements Serializable {
    private static final long serialVersionUID = 178951039515092385L;

    private Integer rid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date date;

    private Integer uid;


}

