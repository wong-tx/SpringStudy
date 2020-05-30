package com.wongtx.demomybatis.mapper;

import com.wongtx.demomybatis.entity.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:25
 */
public interface UserMapper {

    @Insert("insert into user (phone ,password) values (#{phone},#{password})")
    void save (User user);
}
