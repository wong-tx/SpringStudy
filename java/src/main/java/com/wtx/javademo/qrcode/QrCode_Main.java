package com.wtx.javademo.qrcode;

/**
 *@Author feri
 *@Date Created in 2019/5/8 11:30
 */
public class QrCode_Main {
    public static void main(String[] args) {
        boolean b=ZxingUtil.encode("Hello Java","jpg",200,200,"hello.jpg");
        System.out.println(b);
    }

}
