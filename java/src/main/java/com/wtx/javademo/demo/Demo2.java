package com.wtx.javademo.demo;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/14 9:42
 */
public class Demo2 {

    public static void main(String[] args) {
        HashMap<String, String> map = Maps.newHashMap();
        map.put("1","1");

        String[] arr = null;

        String[] arr1 = {"1","2","3","4"};
        arr = arr1;

        map.put("1",arr[0]);
        System.err.println(map.get("1"));
    }
}
