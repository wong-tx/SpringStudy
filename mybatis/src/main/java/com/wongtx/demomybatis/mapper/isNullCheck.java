package com.wongtx.demomybatis.mapper;

import com.wongtx.demomybatis.entity.IsNullCheck;

import java.util.List;
import java.util.Map;


/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/17 10:47
 */
public interface isNullCheck {

    List<Map> list();

    List<IsNullCheck> listAll();
}
