package com.wongtx.demomybatis.service.impl;

import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.mapper.XZGGMapper;
import com.wongtx.demomybatis.service.XZGGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:57
 */
@Service
@Transactional
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
}
