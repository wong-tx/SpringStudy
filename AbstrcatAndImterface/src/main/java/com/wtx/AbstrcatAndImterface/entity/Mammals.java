package com.wtx.AbstrcatAndImterface.entity;

import com.wtx.AbstrcatAndImterface.faentity.animal;
import lombok.Data;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/30 11:25
 */
@Data
public class Mammals  extends animal {

    String live;

    @Override
    public void eat() {

    }

    protected  void game(){
        System.out.println("游戏");
    }
}
