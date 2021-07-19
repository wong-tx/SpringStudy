package com.wtx.storedprocedure.mapper;

import com.wtx.storedprocedure.entity.SysUser;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/24 10:52
 */

public interface SysUserMapper {
    /**
     * 使用存储过程查询用户信息
     *
     * @param user
     * @return
     */
    void selectUserById(SysUser user);

    SysUser  insertces(SysUser sysUser);
}
