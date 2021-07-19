package com.wongtx.demomybatis.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.mapper.XZGGMapper;
import com.wongtx.demomybatis.vo.R;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
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
    public List<XZGG>  cesBoolean(Boolean flag){
        List<XZGG> cesins = xzggMapper.cesBoolean(flag);

        System.out.println("oo");
        return  cesins;
    }
    @GetMapping("/cesnull.do")
    public String cesnull(){
        String s = xzggMapper.cesnull();

        s = "1".equals(s) ? "空的" : s;
        System.err.println(s);
        return String.valueOf(s);
    }

    @PostMapping("/inssave.do")
    public R inssave(){
        XZGG xzgg = new XZGG();
        xzgg.setCp("百威");
        User user = new User();
        user.setUserMsg("冰酒石");

        int inssave = xzggMapper.inssave(xzgg, user);
        if (inssave > 0) {
            return R.setOK();
        }
        return R.setERROR();
    }

    @PostMapping("cesin.do")
    public  void vesin(String id){
        List<String> wareIdList = Arrays.asList(id.split(","));
        List<XZGG> cesin = xzggMapper.cesin(wareIdList);
        System.out.println(JSON.toJSONString(cesin));
    }

    @PostMapping("xiaozhan.do")
    public  void vesin(){
//        List<XZGG> xiaozhangege = xzggMapper.xiaozhangege();
//        System.out.println(JSON.toJSONString(xiaozhangege));
//        boolean b = xzggMapper.updatexxxzzz(15);
        String toString = xzggMapper.findByIdToString(15);
        System.err.println(toString);
    }

    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//// long -- 时间类型转换
//        c.setTimeInMillis(1593446400000L);
//
//        Date date = new Date();
//        long time = date.getTime();
//        System.err.println(c.getTime());
//        System.err.println(time);

//        List<Object> list = Lists.newArrayList();
////        if (list.isEmpty()){
////            System.err.println("数据为空！");
////        }
////        list = null;
////        if (list.isEmpty()){
////            System.err.println("数据为null");
////        }
//        XZGG xzgg = new XZGG();
//        String cp = null;
//        xzgg.setCp(cp);
//        System.out.println(JSON.toJSONString(xzgg));

        String str = "";
        String s = null;

        if (StringUtils.isNotBlank(s)){
            System.out.println("jn ");
        }
        if (StringUtils.isNotBlank(str)){
            System.out.println("ss");
        }
    }

}
