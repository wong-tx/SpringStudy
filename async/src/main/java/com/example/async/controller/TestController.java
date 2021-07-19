package com.example.async.controller;

import com.example.async.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/12/16 11:32
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        System.out.println("web请求使用线程");
//        System.out.println(Thread.currentThread().getName());
        System.out.println("-------------");
        testService.asyncTest();
        testService.test();
        return "test";
    }

}
