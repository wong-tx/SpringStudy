package com.wongtx.demomybatis.demo;




import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/8 19:32
 */
public class Demo0 {

    public static void main(String[] args) {

        String result = "系统异常:接口连接失败";
        JSONObject jsonObject = JSONObject.fromObject(result);
        System.out.println(JSON.toJSONString(jsonObject));
        Map<Object, Object> map = new HashMap<>();
        map.put("key","1");
        map.put("date","1996-09-13 02:30:30");

        try {
            int key = Integer.parseInt(map.get("key").toString());
            System.err.println(key);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            map.put("执行","是是是");
            Date date = new Date(map.get("date").toString());
            System.err.println(date);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("进来了");
            Object o = map.get("执行");
            System.out.println(o.toString());

        } finally {
            System.out.println("执行了");

        }
        try {
            byte key1 = Byte.parseByte(map.get("key").toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            BigDecimal key2 = BigDecimal.valueOf(Double.parseDouble(map.get("key").toString()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            BigDecimal bd=new BigDecimal(map.get("key").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BigDecimal key3 = (BigDecimal) map.get("key");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
