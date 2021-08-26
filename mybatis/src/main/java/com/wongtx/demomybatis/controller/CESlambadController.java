package com.wongtx.demomybatis.controller;

import com.wongtx.demomybatis.mapper.XZGGMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/12/29 15:36
 */
@RestController
public class CESlambadController {

    @Resource
    XZGGMapper xzggMapper;

    @PostMapping("/lambad.do")
    public void findAll(){
        List<Integer> list = Stream.of(18, 19).collect(toList());
        list.forEach(id ->xzggMapper.updatexxxzzz(id));
    }

    @PostMapping("/cesFloat.do")
    public void cesFloat(){
        Float aFloat = xzggMapper.cesFloat();
        boolean b = null == aFloat;
        System.out.println(b);
    }
}
