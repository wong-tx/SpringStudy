package com.wongtx.demomybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.mapper.UserMapper;
import com.wongtx.demomybatis.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:29
 */
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.save(user);
        System.err.println(JSON.toJSONString(user));

    }

    @Override
    public List<User> find() {
        List<User> user = userMapper.find();
        return user;
    }

    @Override
    public User updateUser(User user) {
        int  i = userMapper.updateUser(user);
        User user1 = new User();
        if (i > 0){
            user1.setUserMsg("成功修改");
        }
        return user1;
    }

    @Override
    public boolean findUser() {
        return userMapper.findUser();
    }

    @Override
    public User findById(User user) {
        return userMapper.findUserbyId(user.getId());
    }

    @Override
    public List<User> findAll(String str) {
       return userMapper.findAll(str);
    }

    @Override
    public User updateSecont(User user) {
        int i = userMapper.updateSecond(user,1);
        return user;
    }

    @Override
    public User saveSecond(User user) {
        int i = userMapper.saveSecond(user);
        return user;
    }

    @Override
    public User saveThree(User user) {
        int i = userMapper.saveThree(user);
        return user;
    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public int bigSave() {
        String key = "(phone ,insertdate ,msg)";
        String values = "('xz',now(),'zg')";
        return userMapper.bigSave(key, values);
    }

    @Override
    public int bigBigSave() {
        String sql = "insert into t_user (phone ,insertdate,msg,password) values('xz',now(),'从此不敢看观音','zg')";
        return  userMapper.bigBigSave(sql);

    }

    @Override
    public List findMap() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        List map = userMapper.findMap(format);
        return map;
    }

    @Override
    public List foreach() {
        int[] arr;
        arr = new int[]{1,2,3};
        List<User> byIdIn = userMapper.findByIdIn(arr);
        return byIdIn;
    }

    @Override
    public List<User> insertforeach(List<User> list) {
        userMapper.insertforeach(list);
        return list;
    }

    @Override
    public List<User> findByUserId(User user) {
        List<User> us = userMapper.findByUserId(user);
        return us;
    }

    @Override
    public int findByMsg() {

        int msg = userMapper.findByMsg("从此不敢看观音");
        return msg;
    }

    @Override
    public String findMsg() {
        String msg = userMapper.findMsg("从此不敢看观音");
        return msg;
    }

    @Override
    public int insertuser() {
        int i = 0;
        try {
            i = userMapper.insertUser("从此不敢看观音,今日份zsww");
        } catch (Exception e) {
            log.error("返回主键失败!");
        }
        return i;
    }
}
