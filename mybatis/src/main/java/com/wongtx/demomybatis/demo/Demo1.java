package com.wongtx.demomybatis.demo;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/22 16:46
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = Maps.newHashMap();
        map.put("port", "port");
        map.put("containerType", "containerType");
        map.put("containerClass", "containerClass");
        map.put("changeType", "changeType");
        map.put("isHistory", "isHistory");
        map.put("office", "office");

        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String filterField = (String) it.next();
            System.out.println(filterField);
        }

    }
}
