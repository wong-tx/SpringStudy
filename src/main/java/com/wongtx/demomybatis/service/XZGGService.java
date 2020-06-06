package com.wongtx.demomybatis.service;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import sun.security.krb5.internal.tools.Klist;

import java.util.List;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:56
 */
public interface XZGGService {

    XZGG save(User user, Role role);

    XZGG find(int id);

    List findbyId(int id);

    int  findmsg(String msg);

    Map<String,Object> findMap(int id);

    List<Map<String,Object>> findMap(String msg);

    int updaateMsg();

    int findCount();

    int saveEntity();

    int updateEntity();

    List findCp(String cp);

    int insert(List<XZGG> list);

    List list();

    int upda(int id);

    int insertEntity(XZGG s);

    List findAllObject();

    List<SqlRowSet> cesqubie(String sql);
    List<Map> cesmap(String sql);

    List select();

    List<XZGG>  iffull();
}
