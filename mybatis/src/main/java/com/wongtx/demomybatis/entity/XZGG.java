package com.wongtx.demomybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:50
 */
@Data
public class XZGG extends PageRequestDTO {

    int id;
    String msg;
    String cp;
    Date createDate;
    String startTime;
    String data;

    public XZGG() {
    }

    public XZGG(String msg, String cp) {
        this.msg = msg;
        this.cp = cp;
    }
}
