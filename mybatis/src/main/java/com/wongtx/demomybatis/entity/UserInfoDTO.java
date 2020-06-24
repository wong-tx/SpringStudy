package com.wongtx.demomybatis.entity;

import io.swagger.annotations.ApiModelProperty;

public class UserInfoDTO extends ModelBaseDTO {
    @ApiModelProperty(value = "公司名称")
    private String companyName;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "账户名")
    private String accountCode;
    @ApiModelProperty(value = "公司地址")
    private String companyAddress;
    @ApiModelProperty(value = "公司全称")
    private String companyFullName;
    @ApiModelProperty(value = "一手客户标识")
    private String primaryCustomer;
    @ApiModelProperty(value = "月结客户标识")
    private String monthlyCustomer;
    @ApiModelProperty(value = "电子邮箱")
    private String email;
    @ApiModelProperty(value = "杂费类型")
    private String incidentalType;
    @ApiModelProperty(value = "发票类型")
    private String invoiceType;
//    @ApiModelProperty(value = "月结合同开始日期")
//    private String monthlyFrom;
//    @ApiModelProperty(value = "月结合同结束日期")
//    private String monthlyTo;
    @ApiModelProperty(value = "作废标识",hidden = true)
    private Integer delFlag;
    @ApiModelProperty(value = "允许登录标识",hidden = true)
    private Integer allowFlag;
    @ApiModelProperty(value = "阅读协议")
    private Integer readTreaty;
    @ApiModelProperty(value = "主密码",hidden = true)
    private String mainPassWord;
    @ApiModelProperty(value = "副密码",hidden = true)
    private String deputyPassWord;
    @ApiModelProperty(value = "用户ID")
    private Integer userID;
    @ApiModelProperty(value = "公司ID")
    private Integer companyID;
    @ApiModelProperty(value = "联系电话")
    private String telephoneNumber;
    @ApiModelProperty(value = "IP地址")
    private String ipAddress;
    @ApiModelProperty(value = "当前港口")
    private String currentPort;
    @ApiModelProperty(value = "可换单港口")
    private String changePort;
    @ApiModelProperty(value = "绑定IC卡号")
    private String icCode;
    @ApiModelProperty(value = "促销平台校验码")
    private String promotionCode;
    @ApiModelProperty(value = "上上签客户Id")
    private String signAccountId;
    @ApiModelProperty(value = "上上签认证状态 0 未认证 1 已认证")
    private int signAccountStatus;
    @ApiModelProperty(value = "签名授权状态 0 未授权 1已授权")
    private Integer authorizationFlag;
    @ApiModelProperty(value = "当前登录用户是否为上上签管理员 1是 0不是")
    private Integer presentUserAdministratorFlag;
    @ApiModelProperty(value = "是否为上上签管理员 1是 0不是")
    private Integer administratorFlag;
    @ApiModelProperty(value = "当前用户标识")
    private Integer selfFlag;
    @ApiModelProperty(value = "上上签企业认证状态 0未认证 1已认证")
    private Integer bestSignAuthStatus;


//    -------------------------------------------
    @ApiModelProperty(value = "岗位备注 ")
    private String gwbz;
    @ApiModelProperty(value = "排序号 ")
    private String sort;
    @ApiModelProperty(value = "用户描述 ")
    private String description;
    @ApiModelProperty(value = "qq 号")
    private String qqid;
    @ApiModelProperty(value = "签名")
    private String qianming;
    @ApiModelProperty(value = "是否可以登录换单 1可以 0不可以")
    private String bChange;
    @ApiModelProperty(value = "显示标识")
    private int flag = 0;
    @ApiModelProperty(value = "操作员")
    private String czy;
    @ApiModelProperty(value = "分组号")
    private byte groupNo;
////
    private String adminFlag;
    private Integer kind;

    String office;
    String nowda;

    String yjc;

    String yjd;
}