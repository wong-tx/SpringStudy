package com.wtx.AbstrcatAndImterface.faentity;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/19 9:11
 */
public abstract class BasePad implements Computer{

    int id;
    String xh;

    public BasePad() {
    }

    public BasePad(int id, String xh) {
        this.id = id;
        this.xh = xh;
    }
   public abstract void game();

    void vodeo(){
        System.out.println("video");
    }

}
