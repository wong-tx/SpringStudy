package com.wtx.springboot;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.wtx.springboot.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/2 9:10
 * 排除自动配置数据库，mybatis
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class, DataSourceTransactionManagerAutoConfiguration.class })
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class,args);
    }
}
