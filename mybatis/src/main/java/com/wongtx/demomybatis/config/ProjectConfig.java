package com.wongtx.demomybatis.config;

import java.util.HashMap;
import java.util.Map;

/**
 *@Author feri
 *@Date Created in 2019/6/12 16:30
 */
public class ProjectConfig {
    //初始积分 -新用户
    public static final int INITNEWSCORE=50;
    public static final int INITNEWSEXPIRE=30; //有效期 新增
    public static final int NEWSEXPIRE=365; //有效期 签到

    public static final int NEWSCORE=30;//第一次签到送30积分
    //购物车上限  商品个数
    public static final int CARTMAXGOODS=200;

    //Redis信息
    public static final String REDISHOST="localhost";
    public static final int REDISPORT=6379;
    public static final String REDISPASS="906913";

    //Redis常用的key的设置
    public static final String SMSPRELIMIT="smspre:";//记录手机号一分钟只能发一次 smspre:180515990152 key
    public static final String SMSPREDAY="smsday:";//记录手机号一天只能发20条 smsday:18515990152
    public static final String SMSCODE="smscode:";//短信验证码  3分钟
    public static final String TOKENJWT="jwt:";//记录令牌  有效期 30分钟
    public static final String TOKENPHONE="user:";//记录手机号对应的令牌  有效期 30分钟
    public static final String USERLOGINCOUNT="uc:";// uc:手机号  次数  10分钟
    public static final String USERSD="userfreeze:";//手机号 所有冻结的手机号
    public static final String SIGNKEY="usign:ljb";//记录每天签到  Set集合 内容 手机号
    public static final String TOKENHEAD="usertoken";//请求消息头的名称，记录令牌  前端
    //正常的是有效期4小时5分钟  备份永久有效 没有的删除  Hash
    public static final String ESGOODSADD="esgoods:add";//es服务记录4小时之内新增的商品信息
    public static final String ESGOODSADDBU="esgoods:addbu";//es服务记录4小时之内新增的商品信息-备份
    public static final String ESGOODSUPDATE="esgoods:update";//es服务记录4小时之内修改的商品信息
    public static final String ESGOODSUPDATEBU="esgoods:updatebu";//es服务记录4小时之内修改的商品信息-备份
    public static final String ESGOODSDELETE="esgoods:del";//es服务记录4小时之内删除的商品信息
    public static final String ESGOODSDELETEBU="esgoods:delbu";//es服务记录4小时之内删除的商品信息-备份



    //短信配置
    public static final String SMSKEY="97245bbce1178f6b82233a8c631e4c76";
    public static final String SMSTEMPID="164065";

    //邮箱相关配置
    public static final String EMAIL="lx_teach@163.com";
    public static final String EMAILPASS="java168";
    public static final String EMAILHOST="smtp.163.com";

    public static Map<Integer,String> projects;
    static {
        projects=new HashMap<>();
        projects.put(10001,"邻家邦");

    }
    //激活地址
    public static final String ACTIVEURL="";
    public static final String AESKEYACTIVECODE="Sr766D1d0ir+q61J2ho7rQ==";

//    //密码加密 采用RSA
//    public static final String PASSRSAPUB="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIPcObwNMNMsOpJB6XUt7/MyQ0croXAQ7pBxqnnY5yTmHf48Yz+0o9310xPTm3n6NvKB66QKAtsc18ULrkgznSkCAwEAAQ==";
//    public static final String PASSRSAPRI="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAg9w5vA0w0yw6kkHpdS3v8zJDRyuhcBDukHGqedjnJOYd/jxjP7Sj3fXTE9Obefo28oHrpAoC2xzXxQuuSDOdKQIDAQABAkAl64xS7zwuTpbdfsUDpN1PhBHjAsIfd08UDQwolF8MthIuXtVc3epw7au+x1RUMcsY+Ve4O/6erU2XVw40uOCxAiEA0XsiqRf+BPFoqPje3TqdXfRuSj9hjRTYrKDTkRz7nvUCIQChJGYwmoADQCrQXpXIUavGXBQ+73Cprgj/PvEfFkk85QIhALHA9gFcTX1uR+wR+jLpeP1v22J/c8yeYtnhQoWBfXY9AiB8/jHyE3Wmj9hl5mhCiO84HuZpZus6As/hxV3dIjlO7QIgYEYa9iYf4c6xT/++OxrD9/aH+v3VSnyDccHSrms1/f8=";

    //密码加密 采用RSA
    public static final String PASSRSAPUB="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKUHkLPlzZY0EI7ngF/DnyxTtncgsRpoUdbd9NLmp75DvUuRbzt9bMamE6ezYtPJLB9fEr2jcygBrSC3fOSjnmECAwEAAQ==";
    public static final String PASSRSAPRI="MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEApQeQs+XNljQQjueAX8OfLFO2dyCxGmhR1t300uanvkO9S5FvO31sxqYTp7Ni08ksH18SvaNzKAGtILd85KOeYQIDAQABAkB2YGDZykOYNKyT9VdOWiI5R6sg9KBVUvMxb3EIP0+f2An4rVgYWpqZ4mmf8zyfj0CUhwZ3krBrvaIL6RAir9KJAiEA6gwyBvdr3Mj143LFWI1GEABU2ozL7SPr7m80ENSmAFcCIQC0giamBW3Oe4rmMACVu/QmXwR/A36/oOtba/SasIHEBwIgNZGFAcMvlOEKJnzmXlY3awIoab1AD47hOTmKmS+SrxECIETyEWEIYdCkT4FshEys5axiTo1VAGyhQkRBD8Sl9mqxAiAhTKxKdF6OISmA5qpqQm+CXUz5hMoK2iJtE/NNk5WN6A==";

    //JWT的签名算法
    public static final String JWTSIGN="SHA256";
    public static final int JWTTIME=30;//令牌的有效期
    public static final String JWTKEY="qfjava_ljb";

    //资源文件的前缀
    public static final String RESOURCEURL="http://localhost:9804/ljbresource/";


    //OSS配置
    // Endpoint以杭州为例，其它Region请按实际情况填写。

    public static final String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    public static final String accessKeyId = "LTAIhTvqTSmlmjeQ";
    public static final String accessKeySecret = "X7X9w0Ck5GEIWgP9tl0Q6sgmFjQuMv";
    public static final String bucketName = "java1901";


}
