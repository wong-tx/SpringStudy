package com.wongtx.demomybatis.entity;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/18 19:14
 */
@Data
public class PageRequestDTO {
    /**
     * 页数
     */
    @NotNull
    @Min(1)
    private Integer pageNum;

    /**
     * 条数
     */
    @NotNull
    @Min(1)
    private Integer pageSize;
}
