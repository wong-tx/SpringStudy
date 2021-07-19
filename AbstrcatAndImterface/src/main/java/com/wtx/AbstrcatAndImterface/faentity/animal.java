package com.wtx.AbstrcatAndImterface.faentity;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/30 11:24
 */

public abstract class animal {
    int age;

    int eye;
    public abstract void eat();
    protected   void sleep(){
        System.err.println("睡觉!");
    }

}
