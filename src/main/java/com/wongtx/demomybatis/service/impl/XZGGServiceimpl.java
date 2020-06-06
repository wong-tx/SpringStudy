package com.wongtx.demomybatis.service.impl;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.mapper.XZGGMapper;
import com.wongtx.demomybatis.service.XZGGService;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:57
 */
@Service
@Transactional
@Slf4j
public class XZGGServiceimpl implements XZGGService {

    @Autowired
    XZGGMapper xzggMapper;
    @Override
    public XZGG save(User user, Role role) {

        XZGG xzgg = new XZGG();
//        Map<String, Object> map = new HashMap<>();
//        map.put("msg",user.getUserMsg());
//        map.put("cp",role.getUserTeacher());
//        map.put("id","");
//        int save = xzggMapper.save(map);
//        if (save > 0){
//            xzgg.setId((int)map.get("id"));
//            xzgg.setMsg(map.get("msg").toString());
//            xzgg.setCp(map.get("cp").toString());
//        }
        int i = xzggMapper.saveSecond(user, role);
        if (i>0){
            xzgg.setCp(role.getUserTeacher());
            xzgg.setMsg(user.getUserMsg());
        }
        return xzgg;
    }

    @Override
    public XZGG find(int id) {
        XZGG xzgg = xzggMapper.find(id);
        String msg = xzgg.getMsg();
        return xzgg;
    }

    @Override
    public List findbyId(int id) {
        return xzggMapper.findById(id);
    }

    @Override
    public int findmsg(String msg) {
        return xzggMapper.findBymsg(msg);
    }

    @Override
    public Map<String, Object> findMap(int id) {

        return xzggMapper.findMap(id);
    }

    @Override
    public List<Map<String, Object>> findMap(String msg) {
        return xzggMapper.findListMap(msg);
    }

    @Override
    public int updaateMsg() {
        int i = xzggMapper.updateMsg("从此不敢看观音", new Date(), 4);
        return i;
    }

    @Override
    public int findCount() {

//        int count = xzggMapper.findCount("");
        int count = xzggMapper.findTop(1);
        return count;
    }

    public String  ces (){
        return "测试注册";
    }

    @Override
    public int saveEntity() {
        XZGG xzgg = new XZGG();
        xzgg.setMsg("今日份假料");
//        xzgg.setCreateDate(new Date());
        xzgg.setCp("lsfy");
        int i = xzggMapper.saveEntity(xzgg);
        return i;
    }

    @Override
    public int updateEntity() {
        XZGG xzgg = new XZGG();
        xzgg.setMsg("今日份假料");
        xzgg.setCreateDate(new Date());
        xzgg.setCp("lsfy");
        xzgg.setId(5);
        int i = xzggMapper.updateEntity(xzgg);
        return i;
    }

    @Override
    public List findCp(String cp) {
        return xzggMapper.findCp(cp);
    }

    @Override
    public int insert(List<XZGG> list) {
        return xzggMapper.insert(list);
    }

    @Override
    public List list() {
        return xzggMapper.list();
    }

    @Override
    public int upda(int id) {
        return xzggMapper.upda(id);
    }

    @Override
    public int insertEntity(XZGG s) {
        return xzggMapper.insertEntity(s);
    }

    @Override
    public List findAllObject() {

        return xzggMapper.findAllObject();
    }

    @Override
    public List<SqlRowSet> cesqubie(String sql) {
        return xzggMapper.cesqubie(sql);
    }

    @Override
    public List<Map> cesmap(String sql) {
        return xzggMapper.cesmap(sql);
    }

    @Override
    public List select() {
        return xzggMapper.select();
    }

    @Override
    public List<XZGG> iffull() {
        return xzggMapper.iffull();
    }
}
