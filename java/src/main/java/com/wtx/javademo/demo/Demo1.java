package com.wtx.javademo.demo;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/23 14:45
 */
public class Demo1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String format = dateFormat.format(new Date());
        System.out.println(format);
String ss = StringUtils.EMPTY;
        String s = " cqxz";
        String bn = s.replace(ss, "bn");

        System.err.println("bn = " + bn);

    }
}
