package com.wtx.javademo.java8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/18 11:43
 */
public class Demo4 {
    public static void main(String[] args) {
        List <Object> list = new ArrayList<>();
        list.add(true);
        list.add(234);
        list.add(new Demo4());

        list.forEach(x -> System.out.println(x.getClass().getName()));
        // String::valueOf 可以接受参数
        List<Object> newlist = list.stream().map(Lists::newArrayList).collect(Collectors.toCollection(ArrayList<Object>::new));
        System.out.println();
        newlist.forEach(x -> System.out.println(x.getClass().getName()));
    }
}
