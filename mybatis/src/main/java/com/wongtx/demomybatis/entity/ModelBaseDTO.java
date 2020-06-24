package com.wongtx.demomybatis.entity;

import lombok.Data;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/16 13:53
 */
@Data
public class ModelBaseDTO {
    /**
     * id
     */
    protected int id;

    /**
     * 响应码
     */
    protected String backCode= "200";

    /**
     * 响应结果
     */
    protected String backMsg;
}
