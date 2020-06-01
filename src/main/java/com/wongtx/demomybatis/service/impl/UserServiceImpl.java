package com.wongtx.demomybatis.service.impl;

import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.mapper.UserMapper;
import com.wongtx.demomybatis.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:29
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> find() {
        List<User> user = userMapper.find();
        return user;
    }

    @Override
    public User updateUser() {
        int  i = userMapper.updateUser();
        User user = new User();
        if (i > 0){
            user.setMsg("成功修改");
        }
        return user;
    }

    @Override
    public boolean findUser() {
        return userMapper.findUser();
    }

    @Override
    public User findById(User user) {
        return userMapper.findUserbyId(user.getId());
    }
}
