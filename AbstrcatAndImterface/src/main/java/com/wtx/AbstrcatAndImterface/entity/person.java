package com.wtx.AbstrcatAndImterface.entity;

import lombok.Data;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/30 11:34
 */
@Data
public class person extends Mammals {
    String game;
    int id;

    void sos(){
        game();
    }
}
