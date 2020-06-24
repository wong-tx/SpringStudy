package com.wongtx.demomybatis.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/17 10:46
 */
@Data
public class IsNullCheck {
    int id;
    int usid;
    String cp;
    Date time;
    BigDecimal bigDecimal;
}
