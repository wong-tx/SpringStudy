package com.wtx.javademo.demo;

import org.springframework.util.DigestUtils;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/9/10 9:46
 */
public class Demo3 {

    public static void main(String[] args) {
//        List<String> idList = Stream.of("1", "2", "3", "4", "5", "6", "5").collect(Collectors.toList());
//        String ids = String.join(",", idList);
//        System.out.println(ids);
//        System.out.println(idList);
//        Object[] objects = idList.toArray();
//        System.out.println(Arrays.toString(objects));
//        String join = StringUtils.join(objects);
//        System.out.println(join);

        // spring自带工具包DigestUtils
        String s = DigestUtils.md5DigestAsHex("1234".getBytes());
        System.err.println(s);
        String s1 = String.valueOf(System.currentTimeMillis());
        System.err.println(s1);

    }

}
