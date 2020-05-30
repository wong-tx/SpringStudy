package com.wongtx.demomybatis.service;

import com.wongtx.demomybatis.entity.User;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:28
 */
public interface UserService {

    void  save(User user);

    List<User> find();

    User updateUser();
}
