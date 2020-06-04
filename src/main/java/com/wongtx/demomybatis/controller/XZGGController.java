package com.wongtx.demomybatis.controller;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.service.UserService;
import com.wongtx.demomybatis.service.XZGGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 16:11
 */
@RestController
public class XZGGController {
    @Autowired
    XZGGService xzggService;


    @PostMapping("/xzggjy.do")
    public XZGG save(){
//        User user = new User();
//        user.setUserMsg("从此不敢看观音");
//
//        Role role = new Role();
//        role.setUserTeacher("ZSWW");
//        XZGG xzgg = xzggService.save(user, role);
        XZGG xzgg = xzggService.find(4);
        return xzgg;
    }
}
