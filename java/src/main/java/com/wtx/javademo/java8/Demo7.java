package com.wtx.javademo.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/25 15:30
 */
public class Demo7 {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Map<Object, Object> map = new HashMap<>();
        String str = "String";
        Set<Object> set = new HashSet<>();
        set.add("set");
        map.put("map","map");
        list.add(set);
        list.add(str);
        list.add(map);

        List<Object> objectList = list.stream().filter("josn"::equals).collect(toList());
        if ( null == objectList || objectList.isEmpty()){
            System.out.println("没有数据");
            System.exit(0);
        }
        System.err.println(objectList.get(0));
        SimpleDateFormat dfMinute = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = dfMinute.parse(LocalDate.now().format(DateTimeFormatter.ISO_DATE_TIME));
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
