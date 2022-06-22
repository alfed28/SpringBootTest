package com.springbootmabatisplusdemo3.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.springbootmabatisplusdemo3.domain.Test;
import com.springbootmabatisplusdemo3.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/21 10:07
 * @Created by 石傲
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService t;

    @GetMapping("/test01")
    public boolean test01(Test test){
        return t.save(test);
    }
    @DeleteMapping("/delete")
    public boolean test02(String username){
        UpdateWrapper<Test> wrapper = new UpdateWrapper<>();
        wrapper.eq("username",username);
        return t.remove(wrapper);
    }

}
