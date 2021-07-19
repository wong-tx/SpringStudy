package com.wtx.javademo.java8;

import java.util.function.Supplier;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/18 10:09
 */
public class Demo1 {
    public static void main(String args[]){
//        Demo1  java8 = new Demo1();
        Supplier<Demo1> us = Demo1::new;
        //等效
        Supplier<Demo1> us2 = () -> new Demo1();
        //获取对象
        Demo1 java8 = us.get();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) ->  a * b;

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + java8.operate(10, 5, addition));
        System.out.println("10 - 5 = " + java8.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + java8.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + java8.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }



    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
