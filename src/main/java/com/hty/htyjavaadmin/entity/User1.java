package com.hty.htyjavaadmin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;


@Data
@TableName("tab_user")
public class User1 {
    private BigInteger id;
    private String name;
    private String nickName;
    private String address;
    //设置格式样式，结果展示还是包含秒,无效
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    private Integer age;
    private String telPhone;
    private String email;
    private char sex;
}
