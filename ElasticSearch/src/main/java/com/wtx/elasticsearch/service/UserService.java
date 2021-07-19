package com.wtx.elasticsearch.service;

import com.wtx.elasticsearch.entity.User;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/28 20:30
 */
public interface UserService {

    boolean insert(User user);

    List<User> search(String searchContent);

    List<User> searchUser(Integer pageNumber, Integer pageSize,String searchContent);

    List<User> searchUserByWeight(String searchContent);
}
