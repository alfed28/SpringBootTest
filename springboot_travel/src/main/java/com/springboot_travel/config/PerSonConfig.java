package com.springboot_travel.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * @Classname PerSonConfig
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/16 10:45
 * @Created by 石傲
 */
@Configuration
public class PerSonConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(new ClassPathResource("person.yml"));
        configurer.setProperties(factoryBean.getObject());
        return  configurer;
    }
}
