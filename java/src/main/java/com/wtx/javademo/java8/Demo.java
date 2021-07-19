package com.wtx.javademo.java8;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/9/1 20:11
 */
public class Demo {

    public static void main(String[] args) {
//        for (int i = 0;i< 20;i++){
//            int random = (int) (Math.random() * 9 + 1);
//            String code = "999";
//            String applyNo = code.substring(code.length() - 2) + new SimpleDateFormat("ddHHmmss").format(new Date()) + random;
//            System.err.println(applyNo);
//        }


        List<String> oneList = new ArrayList<>();
        String s = "id" ;
        String s1 = "珠海";
        String s2 = "何金荣";
        oneList.add(s);
        oneList.add(s1);
        oneList.add(s2);
//
//
        List<String> twoList = new ArrayList<>();
        String s3 = "珠海国码";
        String s4 = "Hejinrong";
        twoList.add(s3);
        twoList.add(s4);
        String str = "/";
//        List<String> oneList = Arrays.asList(str.split("/"));
        List<String> resultList = compareListHitData(oneList, twoList);
        System.out.println(resultList);

        boolean b = oneList.stream().anyMatch(twoList::contains);
        System.err.println(b);
        Collection collection = CollectionUtils.intersection(oneList, twoList);
        if (!collection.isEmpty()){
            System.out.println("有数据!");
        }

    }

    /**
     *  通过遍历两个List中按id属性相等的归结到resultList中
     * @param oneList
     * @param twoList
     */
    public static List<String> compareListHitData(List< String> oneList, List<String> twoList) {

//        List<String> resultList = oneList.stream().filter(twoList::contains).collect(toList());

        List<String> resultList = oneList.stream().map(it -> twoList.stream()
                .filter(m -> Objects.equals(m, it))
                .findFirst().orElse(null))
                .filter(Objects::nonNull).collect(toList());
        return resultList;
    }

//    public static List<Map<Object, Object>> compareListHitData(List<Map<Object, Object>> oneList, List<Map<Object, Object>> twoList) {
//        List<Map<Object, Object>> resultList = oneList.stream().map(map -> twoList.stream()
//                .filter(m -> Objects.equals(m.get("id"), map.get("id")))
//                .findFirst().map(m -> {
//                    map.putAll(m);
//                    return map;
//                }).orElse(null))
//                .filter(Objects::nonNull).collect(Collectors.toList());
//        return resultList;
//    }
}
