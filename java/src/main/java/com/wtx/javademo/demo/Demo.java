package com.wtx.javademo.demo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/8 13:18
 */
public class Demo {
    public static void main(String[] args) {
//        Integer i = 1;
//        Integer ss = null;
//
//        String s = String.valueOf(i);
//        String sss = String.valueOf(ss);
//
//        System.out.println(s);
//        System.out.println(sss);
//        List<Object> list = Lists.newArrayList();
//        if (list.isEmpty()){
//            System.err.println("komg");
//        }

        String str = "￥1";
        String s = str.split("￥")[1];
        String w = str.split("￥")[0];
        System.out.println(s);
        System.out.println(w);

        ArrayList<Map> list = Lists.newArrayList();

        HashMap<Object, Object> map = Maps.newHashMap();
//        HashMap<Object, Object> map1 = Maps.newHashMap();
        map.put("重庆","xz");
        map.put("中山","长沙");
        list.add(map);
//        list.add(map1);
        for (Map map2 : list) {
            for (Object o : map2.keySet()) {
                System.err.println(o);
                System.err.println(map2.get(o));
            }
        }

    }
}
