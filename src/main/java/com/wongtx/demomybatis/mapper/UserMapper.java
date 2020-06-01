package com.wongtx.demomybatis.mapper;

import com.wongtx.demomybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    // 测试修改  返回对象，失败
    @Update("update user set phone = '1005'  where password = 1")
    int updateUser();

    //测试boolean返回类型
    @Select("select * from user where password = 1")
    Boolean findUser();

    //测试傳入和本身參數名不一致能否獲取  与传入参数一致即可
    @Select("select * from user where id = #{userId}")
    User findUserbyId(Integer userId);
}
