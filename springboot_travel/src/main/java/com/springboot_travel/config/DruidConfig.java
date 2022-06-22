//package com.springboot_travel.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//
//import java.util.ResourceBundle;
//
///**
// * @Classname DruidConfig
// * @Description TODO
// * @Version 1.0.0
// * @Date 2022/6/15 14:15
// * @Created by 石傲
// */
//@Configuration
//public class DruidConfig {
//
//    @Bean
//    public DruidDataSource getDruidDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql:///travel?serverTimezone=Asia/Shanghai");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        dataSource.setMaxActive(20);
//        dataSource.setMinIdle(10);
//        dataSource.setInitialSize(15);
//        return dataSource;
//    }
//    @Bean
//    public SqlSessionFactoryBean getSqlSessionFactoryBean(){
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(getDruidDataSource());
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.springboot_travel.domain");
//        return sqlSessionFactoryBean;
//    }
//
//}
