package com.wtx.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/28 20:27
 */
@Document(indexName = "userindex", type = "user")
@Data
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createtm;

    // getter和setter 略
}
