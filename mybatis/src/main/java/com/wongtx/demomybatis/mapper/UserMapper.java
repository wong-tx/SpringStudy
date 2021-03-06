package  com.wongtx.demomybatis.mapper;

import  com.wongtx.demomybatis.entity.User;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:25
 */
public interface UserMapper {

    /**
     * 返回主键测试 @Options
     * @param user
     * @return
     */
    @Insert("insert into t_user (phone ,password) values (#{phone},'1234')")
//    @Options(useGeneratedKeys=true,keyProperty="id")
    void save (User user);
    // 测试是否字符串需要‘' -- 都可以
    @Select("select * from t_user where password = '2'")
    List<User> find();

    // 测试修改  返回对象，失败
    @Update("update t_user set phone = #{phone}  where password = #{password}")
    int updateUser(User user);

    //测试boolean返回类型
    @Select("select * from t_user where password = 1")
    Boolean findUser();

    //测试傳入和本身參數名不一致能否獲取  与传入参数一致即可
    @Select("select id,phone as userPhone,insertdate as createDate,msg as userMsg,password as userPassWord, sex from t_user where id = #{userId}")
    User findUserbyId(Integer userId);

    // 测试xml
    List<User> findAll(String str);

    // 测试传入两个参数
    int updateSecond(@Param("user") User user, @Param("id") Integer id);

    // xml 新增
    int saveSecond(User user);

    // xml tag
    int saveThree(User user);

    // xml 查询
    User findById(Integer id);

    //
    @Insert("insert into t_user ${key} values ${values}")
    int bigSave(String key,String values);

    @Insert("${sql}")
    int bigBigSave(String sql);

    List findMap(String da);

    //foreach标签
    List<User> findByIdIn(int[] intIds);

    void insertforeach(List<User> list);

    // 测试传递对象
    List<User> findByUserId(User user);

    @Select("select count(*) from t_user where msg = #{msg}")
    int findByMsg(String msg);

    String findMsg(String msg);

    int insertUser(String msg);

}
