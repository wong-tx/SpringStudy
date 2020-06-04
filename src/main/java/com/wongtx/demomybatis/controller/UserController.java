package com.wongtx.demomybatis.controller;

import com.alibaba.fastjson.JSON;
import com.wongtx.demomybatis.entity.User;
import com.wongtx.demomybatis.service.UserService;
import com.wongtx.demomybatis.vo.R;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/5/30 14:35
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser.do")
    public R save(@RequestBody User user){
        userService.save(user);
        return R.setOK("新增成功", JSON.toJSONString(user));
    }

    @GetMapping("find.do")
    public  R find(){
        List<User> user = userService.find();
        return R.setOK("新",JSON.toJSONString(user));
    }

    @PutMapping("/updateUser.do")
    public R updateUser(@RequestBody User user1){
        User user = userService.updateUser(user1);
        return  R.setOK("修改",JSON.toJSONString(user));
    }

    @GetMapping("findUSer.do")
    public  Boolean findUser(){
        return   userService.findUser();

    }

    @GetMapping("findbyId.do")
    public  User findUser(@RequestBody User user){
        // @RequestBody 传递对象获取；否则获取不到
        User dto = userService.findById(user);
        return dto;

    }

    @GetMapping("/findAll")
    public  List<User> findAll(@RequestParam String string){
        System.out.println(string);
        List<User> all = userService.findAll(string);
        return all;
    }

    @PutMapping("/put.do")
    public User updateSecond(@RequestBody User user){
     user = userService.updateSecont(user);
     return user;
    }

    @PostMapping("/saveSecond.do")
    public User saveSecond(@RequestBody User user){
//        user.setCreateDate(new Date());
     user = userService.saveSecond(user);
     return user;
    }

    @PostMapping("/saveThree.do")
    public User saveThree(@RequestBody User user){
     user = userService.saveThree(user);
     return user;
    }

    @PostMapping("/findById.do")
    public User  findById(){
    User user = userService.findById(1);
     return user;
    }

    // 来票大的
    @PostMapping("/ggdncf.do")
    public R bigSave(){
        int i = userService.bigSave();
        User user = new User();
        if (i>0){
            user.setUserMsg("新增成功");
        }
        return R.setOK("成功",JSON.toJSONString(user));
    }

    // 来票更大的
    @PostMapping("/xzgg.do")
    public R bigBigSave(){
        int i = userService.bigBigSave();
        User user = new User();
        if (i>0){
            user.setUserMsg("新增成功");
        }
        return R.setOK("成功",JSON.toJSONString(user));
    }


    // 大map
    @PostMapping("/map.do")
    public R findMap(){
        List map = userService.findMap();
        List<User> list = new ArrayList();
        if (map.size()> 0){
            for (Object o : map) {
                Map next = (Map) o;
                User user = new User();
                user.setUserPhone(next.get("userPhone")== null ? "" : next.get("userPhone").toString());

                user.setUserMsg(next.get("userMsg") == null ? "" : next.get("userMsg").toString());
                list.add(user);
            }
            return R.setOK("成功",JSON.toJSONString(list));
        }
        return R.setERROR("失败");
    }

    @GetMapping("/foreach.do")
    public R foreach(){
        List foreach = userService.foreach();
        if (foreach.size() > 0) {
            return R.setOK("成功",JSON.toJSONString(foreach));
        }
        return R.setERROR("失败");
    }

    @PostMapping("/insertforeach.do")
    public R insertforeach(@RequestBody List<User> list){
        List foreach = userService.insertforeach(list);
        if (foreach.size() > 0) {
            return R.setOK("成功",JSON.toJSONString(foreach));
        }
        return R.setERROR("失败");
    }

    @GetMapping("/findByUserId")
    public List<User>  findByUserId(@RequestBody User user){
        List<User> byUserId = userService.findByUserId(user);
        return byUserId;

    }

    @GetMapping("/findByMsg.do")
    public User findByMsg(){
        int byMsg = userService.findByMsg();
        User user = new User();
        if (byMsg > 0){
            user.setUserMsg(byMsg+"");
        }
        return user;
    }

    @GetMapping("/findMsg.do")
    public String findMsg(){
    return userService.findMsg();
    }

    @PostMapping("/insertUSer.do")
    public int insertUser(){
        int insertuser = userService.insertuser();
        return insertuser;
    }
}
