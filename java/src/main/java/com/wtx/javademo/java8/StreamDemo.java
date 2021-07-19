package com.wtx.javademo.java8;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/6 15:11
 */
public class StreamDemo {


    public static void main(String[] args) {
        List<Map> list = Lists.newArrayList();
        Map map = Maps.newHashMap();
        map.put("x", "重");
        map.put("z", "庆");
        list.add(map);
        Map map1 = Maps.newHashMap();
        map1.put("x", "拉");
        map1.put("z", "萨");
        list.add(map1);
        Map map2 = Maps.newHashMap();
        map2.put("g", "g");

        list.add(map2);

        list.parallelStream().forEach(System.err::println);
        list.forEach(System.err::println);

        Object x1 = list.stream().map(mp -> mp.get("x")).findFirst().get();
        System.out.println("X : " + x1.toString());
//        peek 操作 一般用于不想改变流中元素本身的类型或者只想元素的内部状态时；
//        而 map 则用于改变流中元素本身类型，即从元素中派生出另一种类型的操作。这是他们之间的最大区别。
//        peek 用于调试
//        如果我们要从 Collection<T> 中获取 T 的某个属性的集合时用 map 也就最好不过了。
        List<Object> x2 = list.stream().map(mp -> mp.get("x")).collect(Collectors.toList());
        System.out.println("X2 : " + Arrays.toString(x2.toArray()));

        List<Object> x3 = list.stream().peek(mp -> mp.get("x")).collect(Collectors.toList());
        System.out.println("X3 : " + Arrays.toString(x3.toArray()));
        Map x = list.stream().filter(l -> l.containsKey("x")).findFirst().get();
        System.out.println(JSON.toJSONString(x));
        List<Integer> asList = Arrays.asList(0, 1, 2, 3);

        System.out.println(asList.stream().min(Integer::compareTo).get());
        System.out.println(asList.stream().max(((o1, o2) -> o1.compareTo(o2))).get());

//        reduce 函数的一个参数为循环的初始值，这里计算累加时初始值为 0，acc 代表已经计算的结果，item 表示循环的每个元素。
        int count = asList.stream().reduce(0, (acc, item) -> acc + item).intValue();
        System.out.println(count);
        int row = asList.stream().reduce(0, (acc, item) -> acc + item);
        System.out.println(row);

//        distinct
        List<String> asList1 = Arrays.asList("2","2","1");
        List<String> collect = asList1.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));
        boolean b = list.stream().anyMatch(Map::isEmpty);

        List<String> collect1 = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 4)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());



    }
}
