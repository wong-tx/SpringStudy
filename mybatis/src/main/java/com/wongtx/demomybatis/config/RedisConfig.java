package com.wongtx.demomybatis.config;


import com.wongtx.demomybatis.utils.JedisUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author feri
 *@Date Created in 2019/6/13 11:35
 */
@Configuration
public class RedisConfig {
    @Bean
    public JedisUtil createJU(){
        return JedisUtil.getInstance();
    }
}
