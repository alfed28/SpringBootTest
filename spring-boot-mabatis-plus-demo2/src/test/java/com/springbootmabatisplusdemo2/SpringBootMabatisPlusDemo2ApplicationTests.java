package com.springbootmabatisplusdemo2;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.springbootmabatisplusdemo2.controller.UserController;
import com.springbootmabatisplusdemo2.domain.User;
import com.springbootmabatisplusdemo2.enums.SexEnum;
import com.springbootmabatisplusdemo2.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class SpringBootMabatisPlusDemo2ApplicationTests {

    @Autowired
    private UserController userController;
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userController.userLogin("shiao3", "111111"));
    }
    @Test
    void test1(){
        User user=new User();
        user.setUsername("李四2");
        user.setPassword("123456");
        System.out.println(userMapper.insert(user));
    }
    //逻辑删除
    @Test
    void test2(){
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("username","李四");
        System.out.println(userMapper.delete(wrapper));
    }
    //逻辑删除后，无法查到他的信息
    @Test
    void test3(){
        System.out.println(userMapper.selectList(null));
    }

    //条件构造器
    @Test
    void test4(){
        //查询
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.like("username","test").isNull("email").eq("sex","女");
        System.out.println(userMapper.selectList(wrapper));
    }
    @Test
    void test5(){
        UpdateWrapper<User> wrapper=new UpdateWrapper<>();
        wrapper.isNull("name");
        System.out.println(userMapper.delete(wrapper));
    }
    @Test
    void test56(){
        //用户名中包含test，并且（性别为女或者email为空）的用户
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.like("username","test")
                .and(userQueryWrapper -> userQueryWrapper.eq("sex","女").or().isNull("email"));
        System.out.println(userMapper.selectList(wrapper));
    }
    @Test
    void test7(){
        //查询user中几个需要的
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("username","email");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }
    @Test
    void test8(){
        //子查询
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("uid","select uid from tab_user where uid<100");
        userMapper.selectList(wrapper);
    }
    @Test
    void test9(){
        //开发中拼接
        String username="";
        String sex="";
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        //复杂写法
        //if (StringUtils.isNotBlank(username)){
        //    //isnotblank判断某一个字符串是否不为空字符串，不为null，不为空白符
        //    wrapper.like("username",username);
        //}
        //if (StringUtils.isNotBlank(sex)){
        //    wrapper.eq("sex",sex);
        //}
        //简单写法
        wrapper.like(StringUtils.isNotBlank(username),"username",username)
                .eq(StringUtils.isNotBlank(sex),"sex",sex);
    }
    @Test
    void test10(){
        //lambdaquerywrapper
        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<>();
        wrapper.eq(User::getSex,"女");
        userMapper.selectList(wrapper);
    }
    @Test
    void test11(){
        //LambdaUpdateWrapper
        LambdaUpdateWrapper<User> wrapper=new LambdaUpdateWrapper<>();
        wrapper.eq(User::getUsername,"李四2");
        userMapper.delete(wrapper);
    }
    @Test
    void test12(){
        //分页
        Page<User> userPage = new Page<>(2,2);

        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<>();
        userMapper.selectPage(userPage,null);
        System.out.println(userPage);
    }
    @Test
    void test13(){
        //分页,自定义sql语句
        Page<User> page = new Page<>(1,2);
        userMapper.selectpage(page);
    }
    ////乐观锁测试
    //@Test
    //void test14(){
    //    //用户1查询电话
    //    User user1 = userMapper.selectById(63);
    //    System.out.println("11111111111------"+user1.getCode());
    //    //用户2查询电话
    //    User user2=userMapper.selectById(63);
    //    System.out.println("222222222=========="+user2.getCode());
    //    //user1将tel－50
    //    user1.setCode("50");
    //    userMapper.updateById(user1);
    //    user2.setCode("30");
    //    userMapper.updateById(user2);
    //
    //    System.out.println("++++++++++++++++++++"+userMapper.selectById(63).getCode());
    //}
    //通用枚举，1代表男0代表女
    @Test
    void test14(){
        User user=new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setSex(SexEnum.FEMALE);
        userMapper.insert(user);
    }
    @Test
    void test15(){
        FastAutoGenerator.create("jdbc:mysql:///travel?serverTimezone=Asia/Shanghai", "root", "123456")//连接数据库
                .globalConfig(builder -> {
                    builder.author("shiao") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com") // 设置父包名
                            .moduleName("test") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_simple") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


}
