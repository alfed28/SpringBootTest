package com.springbootmabatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springbootmabatisplusdemo.domain.TabUser;
import com.springbootmabatisplusdemo.mapper.TabUserMapper;
import com.springbootmabatisplusdemo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootMabatisPlusDemoApplicationTests {

    @Autowired
    private TabUserMapper u;
    @Autowired
    private IUserService u2;
    @Test
    void contextLoads() {
        System.out.println(u.selectById(30).toString());
    }
    //增加
    @Test
    void test1(){
        TabUser user = new TabUser();
        user.setUsername("shiao6");
        user.setPassword("123456");
        u.insert(user);
    }
    //删除根据 ID 删除
    @Test
    void test2(){
        System.out.println(u.deleteById(31));
    }
    //根据 columnMap 条件，删除记录
    @Test
    void test3(){
        Map<String,Object> map=new HashMap<>();
        map.put("username","test04");
        System.out.println(u.deleteByMap(map));
    }
    //根据 entity 条件，删除记录
    @Test
    void test4(){
        UpdateWrapper<TabUser> wrapper = new UpdateWrapper<>();
        wrapper.eq("username","shiao1");
        System.out.println(u.delete(wrapper));
    }
    //批量删除
    @Test
    void test5(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(56);
        list.add(57);
        list.add(58);
        list.add(59);
        System.out.println(u.deleteBatchIds(list));
    }
    //修改根据id
    @Test
    void test6(){
        TabUser user = new TabUser();
        user.setPassword("111111");
        user.setUid(52);
        System.out.println(u.updateById(user));
    }
    //修改
    @Test
    void test7(){
        TabUser user=new TabUser();
        user.setUsername("shiao3");
        UpdateWrapper<TabUser> wrapper = new UpdateWrapper<>();
        wrapper.eq("username","shiao2");
        System.out.println(u.update(user, wrapper));
    }
    //查询
    @Test
    void test8(){
        System.out.println(u.selectById(52));
    }
    @Test
    void test9(){
        QueryWrapper<TabUser> wrapper=new QueryWrapper<>();
        wrapper.eq("username","shiao3");
        System.out.println(u.selectOne(wrapper));
    }
    @Test
    void test10(){
        QueryWrapper<TabUser> wrapper=new QueryWrapper<>();
        wrapper.eq("sex","女");
        System.out.println(u.selectList(wrapper));
    }
    @Test
    void test11(){
        QueryWrapper<TabUser> wrapper=new QueryWrapper<>();
        wrapper.eq("sex","女");
        System.out.println(u.selectCount(wrapper));
    }
    @Test
    void test12(){
        List<Integer> l=new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(29);
        System.out.println(u.selectBatchIds(l));
    }

    //service
    @Test
    void test13(){
        TabUser user = new TabUser();
        user.setUsername("shiao4");
        user.setPassword("123456");
        System.out.println(u2.save(user));
    }
    @Test
    void test14(){
        LinkedList<TabUser> l=new LinkedList<>();

    }
    @Test
    void test15(){
        UpdateWrapper<TabUser> wrapper = new UpdateWrapper<>();
        wrapper.eq("username","shiao4");
        System.out.println(u2.remove(wrapper));
    }
    @Test
    void test16(){
        Page<TabUser> tabUserPage = new Page<>();
        tabUserPage.setCurrent(1);
        tabUserPage.setSize(2);
        u2.page(tabUserPage).getRecords().forEach(System.out::println);
    }
    @Test
    void test17(){
        u.selectList(new QueryWrapper<TabUser>().eq("sex","女")).forEach(System.out::println);
        QueryWrapper<TabUser> wrapper = new QueryWrapper<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","shiao3");
        map.put("password","111111");
        wrapper.allEq(map);
        System.out.println(u.selectOne(wrapper));
    }
}
