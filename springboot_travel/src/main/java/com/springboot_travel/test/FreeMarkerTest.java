package com.springboot_travel.test;

import cn.hutool.core.date.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Classname FreeMarkerTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/16 17:06
 * @Created by 石傲
 */
@Controller
public class FreeMarkerTest {
    @GetMapping("/test/freemarker")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello","test freemarker");
        modelAndView.addObject("flag",true);
        modelAndView.addObject("date",new DateTime());
        modelAndView.addObject("age",23);
        modelAndView.addObject("age2",13.2);
        modelAndView.addObject("age3",13.22222);
        //modelAndView.addObject("age3",13.2);
        modelAndView.setViewName("2");
        return modelAndView;
    }
}
