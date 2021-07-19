package com.wtx.javademo.java8;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/12/17 17:22
 */
@Data
public class Apple {
    private String id; //苹果id

    private String productDate; //生产日期

    private BigDecimal price; //价格


    public static void main(String[] args) {
        List appleList = new ArrayList<>();

        Apple apple1 = new Apple();
        apple1.setId("1");
        apple1.setProductDate("2020-04-12");
        apple1.setPrice(new BigDecimal(5500));
        Apple apple4 = new Apple();
        apple4.setId("1");
        apple4.setProductDate("2020-04-15");
        apple4.setPrice(new BigDecimal(5600));

        Apple apple2 = new Apple();
        apple2.setId("2");
        apple2.setProductDate("2020-04-10");
        apple2.setPrice(new BigDecimal(5000));

        Apple apple3 = new Apple();
        apple3.setId("3");
        apple3.setProductDate("2020-04-11");
        apple3.setPrice(new BigDecimal(6500));

        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);

        // 分組
        Map<Integer, List<Apple>> genderGroup = (Map<Integer, List<Apple>>) appleList.stream().collect(Collectors.groupingBy(Apple::getId, Collectors.toList()));


        System.out.println(genderGroup);

    }
}
