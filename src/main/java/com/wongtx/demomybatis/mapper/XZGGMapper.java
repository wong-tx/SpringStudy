package com.wongtx.demomybatis.mapper;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:51
 */
public interface XZGGMapper {


    int save(@Param("map") Map map);

    int saveSecond(@Param("user") User user,@Param("role") Role role);


    XZGG find(int id);
}
