package com.wongtx.demomybatis.service;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:56
 */
public interface XZGGService {

    XZGG save(User user, Role role);

    XZGG find(int id);

}
