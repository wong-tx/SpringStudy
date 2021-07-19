package com.wtx.storedprocedure.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/24 10:48
 */
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    private Long id;
    private Long oldId;
    private Long newId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;


}
