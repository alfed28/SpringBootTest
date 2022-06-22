package com.springboot_travel.util;


import lombok.Data;

@Data
public class R {
    private Integer code;
    private String message;
    private Object data;

    public static R ok(Object data){
        R r=new R();
        r.code=200;
        r.message="ok";
        r.data=data;
        return r;
    }
    public static R fail(Object data){
        R r = new R();
        r.code=300;
        r.message="fail";
        r.data=data;
        return r;
    }
    public static R error(Object data){
        R r = new R();
        r.code=500;
        r.message="error";
        r.data=data;
        return r;
    }
    public static R setR(int code,String message,Object data){
        R r = new R();
        r.code=code;
        r.message=message;
        r.data=data;
        return r;
    }
}
