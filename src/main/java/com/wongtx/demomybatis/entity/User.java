package com.wongtx.demomybatis.entity;

import lombok.Data;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:30
 */
@Data
public class User {
    int id;
    String phone;
    String password;
    String msg;
}
