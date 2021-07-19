package com.example.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/12/16 11:31
 */
@Service
public class TestService {

    public void test() {
        System.out.println("同步方法使用线程");
//        System.out.println(Thread.currentThread().getName());
        System.out.println("-------------");
    }

    @Async
    public void asyncTest() {
        System.out.println("异步方法使用线程");
//        System.out.println(Thread.currentThread().getName());
        System.out.println("-------------");
    }

}
