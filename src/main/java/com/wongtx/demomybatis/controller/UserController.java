package com.wongtx.demomybatis.controller;

import com.alibaba.fastjson.JSON;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.service.UserService;
import com.wongtx.demomybatis.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
