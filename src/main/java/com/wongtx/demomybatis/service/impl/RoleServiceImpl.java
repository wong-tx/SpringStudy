package com.wongtx.demomybatis.service.impl;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.mapper.RoleMapper;
import com.wongtx.demomybatis.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 13:59
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        List<Role> all = roleMapper.findAll();
        return all;
    }

    @Override
    public Role inser(Role role) {
         roleMapper.insertRole(role);

        return role;
    }
}
