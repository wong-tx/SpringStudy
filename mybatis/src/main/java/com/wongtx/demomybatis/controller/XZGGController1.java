package com.wongtx.demomybatis.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.mapper.XZGGMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/18 10:00
 */
@RestController
public class XZGGController1 {
    @Resource
    XZGGMapper xzggMapper;

//    @GetMapping("/getmap.do")
//    public  String getMap(int id){
//        Map<String, String> map = xzggMapper.getMap(id);
//        return JSON.toJSONString(map);
//    }
    @GetMapping("/getmap.do")
    public PageInfo getdto(XZGG cp){
        Page<XZGG> page = new Page<>();
        page = PageHelper.startPage(cp.getPageNum(),cp.getPageSize(),"id desc");
        xzggMapper.getDto(cp);
        return new PageInfo<>(page);
    }

    @GetMapping("/gmap.do")
    public Boolean dto(XZGG cp){
        Boolean count = xzggMapper.count(cp.getId());
        return count;
    }

    @PostMapping("/glist.do")
    public List<XZGG> dto(){

        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        String ids = String.join(",", list);
        List<XZGG> getin = xzggMapper.getin(ids);
        return getin;
    }
    @PostMapping("/ins.do")
    public void  get(XZGG xzgg){
        int insert = xzggMapper.ins(xzgg);
        System.out.println("oo");
    }
    @PostMapping("/cesins.do")
    public List<XZGG>  gets(XZGG xzgg){
        List<XZGG> cesins = xzggMapper.cesins();

        System.out.println("oo");
        return  cesins;
    }

    @GetMapping("/cesboolean.do")
    public List<XZGG>  cesBoolean( ){
        List<XZGG> cesins = xzggMapper.cesBoolean(true);

        System.out.println("oo");
        return  cesins;
    }


}
