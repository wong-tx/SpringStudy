package  com.wongtx.demomybatis.mapper;


import com.wongtx.demomybatis.entity.Role;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 13:56
 */
public interface RoleMapper {

    List<Role> findAll();

    int insertRole(Role role);
}
