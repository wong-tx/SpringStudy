package com.wongtx.demomybatis.controller;


import com.alibaba.fastjson.JSON;
import com.wongtx.demomybatis.entity.IsNullCheck;
import com.wongtx.demomybatis.mapper.isNullCheck;
import com.wongtx.demomybatis.utils.JedisUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/13 9:57
 */
@RestController
public class SessionController {

    @Resource
    JedisUtil jedisUtil;
    @Resource
    isNullCheck isNullCheck;

    @GetMapping("/session.do")
    public String getSession(HttpServletRequest request){
//        request.getSession().setAttribute("id","token");
        jedisUtil.setExpire(request.getSession().getId(),"西藏啊!",60);
        return  request.getSession().getId();

    }

    @GetMapping("/getsession.do")
    public  String getSessionId(HttpServletRequest request){
        System.err.println(request.getSession().getId());
        String s = jedisUtil.get(request.getSession().getId());
        return s;
    }

    @GetMapping("/checkIsNull.do")
    public String checkIsNull(){
//        List<Map> list = isNullCheck.list();
//        ArrayList<IsNullCheck> checks = new ArrayList<>();
//        for (Map map : list) {
//            IsNullCheck check = new IsNullCheck();
//            check.setId(Integer.parseInt(map.get("id").toString()));
//            check.setUsid(map.get("usid") ==null ?0:Integer.parseInt(map.get("usid").toString()));
//            check.setCp(map.get("cp") == null ? "" : map.get("cp").toString());
//            check.setTime(map.get("time") == null ? null:(Date) map.get("time"));
//            check.setBigDecimal(map.get("bigDecimal") == null ? BigDecimal.valueOf(0):new BigDecimal(map.get("bigDecimal").toString()));
//            checks.add(check);
//        }
        List<IsNullCheck> checks = isNullCheck.listAll();

        return JSON.toJSONString(checks);
    }

    public static void main(String[] args) {
//        String token = "Bearer 1341313131313";
//        String bearer = token.substring(token.indexOf(" ") +1 );
//        System.err.println(bearer);
//
//        String s = "{\n" +
//                "   \"page\":{ \"pageNum\": 1,\n" +
//                "    \"pageSize\" : 1\n" +
//                "    },\n" +
//                "    \"id\" : 1\n" +
//                "\n" +
//                "    }";
//        Map map = null;
//        try {
//            map = JSON.parseObject(JSON.toJSONString(s), Map.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        String s1 = null;
//        try {
//            Object page = map.get("page");
//            s1 = JSON.toJSONString(page);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            Page page1 = JSON.parseObject(s, Page.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        PageInfo pageInfo = JSON.parseObject(s1, PageInfo.class);
//        System.out.println("fghjk");

        String s = StringUtils.EMPTY;
        BigDecimal bigDecimal = new BigDecimal(s);
        System.out.println(bigDecimal);
    }
}
