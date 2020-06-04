package com.wongtx.demomybatis.controller;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.service.RoleService;
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
 * @date 2020/6/3 14:01
 */
@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/getAll.do")
    public List<Role> findAll(){
        List<Role> all = roleService.findAll();
        return all;
    }

    @PostMapping("/insertRole.do")
    public Role insertRole(@RequestBody Role role){
        Role inser = roleService.inser(role);
        return inser;
    }
}
