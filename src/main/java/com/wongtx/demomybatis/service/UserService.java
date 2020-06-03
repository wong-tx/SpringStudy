package com.wongtx.demomybatis.service;

import com.wongtx.demomybatis.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:28
 */
public interface UserService {

    void  save(User user);

    List<User> find();

    User updateUser(User user);

    boolean findUser();

    User findById(User user);

    List<User> findAll(String str);

    User updateSecont(User user);

    User saveSecond(User user);

    User saveThree(User user);

    User findById(Integer id);

    int bigSave();

    int bigBigSave();

    List findMap();

    List foreach();

    List<User> insertforeach(List<User> list);

    List<User> findByUserId(User user);
}
