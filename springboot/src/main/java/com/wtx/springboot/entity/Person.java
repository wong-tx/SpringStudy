package com.wtx.springboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/2 9:29
 */
@Data
@Component
@ConfigurationProperties(prefix = "person.dog")
@PropertySource(value = "classpath:config/person.yml",encoding = "utf-8")
public class Person {
    @Value("${age}")
    int age ;
    @Value("${name}")
    String name;
}
