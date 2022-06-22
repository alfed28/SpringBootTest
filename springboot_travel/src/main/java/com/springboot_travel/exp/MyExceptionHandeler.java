package com.springboot_travel.exp;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname MyExceptionHandeler
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 21:29
 * @Created by 石傲
 */
@ControllerAdvice
@ResponseBody
public class MyExceptionHandeler {
    @ExceptionHandler(BindException.class)
    public String handlerDataBindException(BindException e){
        return e.getBindingResult().getFieldError().getDefaultMessage();
    }
}
