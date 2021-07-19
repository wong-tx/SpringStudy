package com.wongtx.demomybatis.mapper;


import com.wongtx.demomybatis.entity.Role;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.entity.XZGG;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 15:51
 */
public interface XZGGMapper {
    List<XZGG> xiaozhangege();

    int save(@Param("map") Map map);

    int saveSecond(@Param("user") User user, @Param("role") Role role);


    XZGG find(int id);
    List findById(int id);
    int findBymsg(String msg);
    Map<String,Object> findMap(int id);

    List<Map<String,Object>> findListMap(String msg);

    int updateMsg(String msg, Date date,int id);

    int findCount(String id);
    int findTop(int top);

    int saveEntity(@Param("dto") XZGG dto);

    int updateEntity(@Param("dto") XZGG dto);

    // 失败
//    @Select("select msg from xzgg where cp = #{cp}")
    List findCp(String cp);

    // 批量更新数据
    int insert(List<XZGG> list);

    @Select("select * from xzgg where id = 1")
    List<XZGG> list();

    @Update("update xzgg set cp = 'ZSWW' where id = #{id}")
    int upda(int id);
    int insertEntity(XZGG s);

    // 失败
    List<Object> findAllObject();

//    SqlRowSet 返回失败
    List<SqlRowSet> cesqubie(String sql);

    List<Map> cesmap(String sql);

    List select();

    // select ifnull(字段名,0) from 表名;
//    @Select("select id,msg,cp,createDate,ifnull(百闻一见,'') data from xzgg")
    // substring
    @Select("select id,msg ,cp from xzgg")
   List<XZGG> iffull();


    Map<String,Object> cesIf(XZGG xzgg);
    @Select("select id,msg ,cp from xzgg  ")
    List<XZGG> pageInfo();

    Map<String,String> getMap(int id);

    List<XZGG> getDto(XZGG cp);

    @Select("select count(*) from xzgg where id = #{id} ")
    Boolean count(int id);

    /**\
     * in 语句
     * @param ids
     * @return
     */
    List<XZGG> getin(String ids);

    int ins(XZGG xzgg);

    List<XZGG> cesins();

    List<XZGG> cesBoolean(Boolean flag);

    int inssave(@Param("xzgg") XZGG xzgg,@Param("user") User user);

    @Select("SELECT nullid  FROM `xzgg` WHERE id = 16")
    String cesnull();

    List<XZGG> cesin(List<String> ids );

    boolean updatexxxzzz(int id);

    String findByIdToString(int id);

    int cessaveinsert(XZGG xzgg);
}
