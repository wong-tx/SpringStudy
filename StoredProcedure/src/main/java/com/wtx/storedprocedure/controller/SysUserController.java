package com.wtx.storedprocedure.controller;

import com.wtx.storedprocedure.entity.SysUser;
import com.wtx.storedprocedure.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/24 11:03
 */
@RestController
public class SysUserController {
    @Autowired
    SysUserMapper sysUserMapper;

    @PostMapping("/cesxz.do")
    public void storedProcedure() {
        SysUser user = new SysUser();
        user.setId(1L);
        sysUserMapper.selectUserById(user);
        System.out.println("用户名：" + user.getUserName());

    }

    @PostMapping("/cesins.do")
    public void insstoredProcedure(SysUser sysUser) {
        SysUser user = sysUserMapper.insertces(sysUser);
        System.out.println(user.getId());
        System.out.println(user.getNewId());
        System.out.println(user.getOldId());

    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Date date = new Date();
        String format = dateFormat.format(date) + " 23:59:59";
        Date parse = dateFormat1.parse(format);
        System.out.println(parse);

    }
}
