package com.wongtx.demomybatis.controller;

import com.alibaba.fastjson.JSON;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.service.UserService;
import com.wongtx.demomybatis.vo.R;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:35
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser.do")
    public R save(@RequestBody User user){
        userService.save(user);
        return R.setOK("新增成功", JSON.toJSONString(user));
    }

    @GetMapping("find.do")
    public  R find(){
        List<User> user = userService.find();
        return R.setOK("新",JSON.toJSONString(user));
    }

    @PutMapping("/updateUser.do")
    public R updateUser(@RequestBody User user1){
        User user = userService.updateUser(user1);
        return  R.setOK("修改",JSON.toJSONString(user));
    }

    @GetMapping("findUSer.do")
    public  Boolean findUser(){
        return   userService.findUser();

    }

    @GetMapping("findbyId.do")
    public  User findUser(@RequestBody User user){
        // @RequestBody 传递对象获取；否则获取不到
        User dto = userService.findById(user);
        return dto;

    }

    @GetMapping("/findAll")
    public  List<User> findAll(@RequestParam String string){
        System.out.println(string);
        List<User> all = userService.findAll(string);
        return all;
    }

    @PutMapping("/put.do")
    public User updateSecond(@RequestBody User user){
     user = userService.updateSecont(user);
     return user;
    }

    @PostMapping("/saveSecond.do")
    public User saveSecond(@RequestBody User user){
     user = userService.saveSecond(user);
     return user;
    }
}
