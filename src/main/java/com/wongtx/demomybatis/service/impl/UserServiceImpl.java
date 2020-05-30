package com.wongtx.demomybatis.service.impl;

import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.mapper.UserMapper;
import com.wongtx.demomybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:29
 */
@Service
@Transactional
public class userServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
