package com.wongtx.demomybatis.mapper;

import com.wongtx.demomybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:25
 */
public interface UserMapper {

    @Insert("insert into user (phone ,password) values (#{phone},'2')")
//    @Options(useGeneratedKeys=true,keyProperty="id")
    void save (User user);
    // 测试是否字符串需要‘' -- 都可以
    @Select("select * from user where password = '2'")
    List<User> find();
}
