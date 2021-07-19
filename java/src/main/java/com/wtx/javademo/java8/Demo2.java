package com.wtx.javademo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/18 11:23
 */
public class Demo2 {
    public static void main(String[] args) {

        List<Object> names = new ArrayList<>();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);

        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        // 顺序流
        list.forEach(System.out::println);
        // 并行流
        list.parallelStream().forEach(System.out::println);


    }
}
