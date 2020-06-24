package com.wongtx.demomybatis.service;

import com.wongtx.demomybatis.entity.Role;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 13:59
 */
public interface RoleService {

    List<Role> findAll();

    Role inser(Role role);
}
