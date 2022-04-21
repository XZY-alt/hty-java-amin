package com.hty.htyjavaadmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author xzy
 * @since 2022-04-19
 */
@TableName("tab_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("id")
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      @ApiModelProperty("姓名")
      private String name;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("昵称")
      private String nickName;

      @ApiModelProperty("年龄")
      private Integer age;

      @ApiModelProperty("地址")
      private String address;

    private String email;

    private String telPhone;

      @ApiModelProperty("1男性、0女性")
      private Integer sex;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public String getNickName() {
        return nickName;
    }

      public void setNickName(String nickName) {
          this.nickName = nickName;
      }
    
    public Integer getAge() {
        return age;
    }

      public void setAge(Integer age) {
          this.age = age;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
          this.email = email;
      }
    
    public String getTelPhone() {
        return telPhone;
    }

      public void setTelPhone(String telPhone) {
          this.telPhone = telPhone;
      }
    
    public Integer getSex() {
        return sex;
    }

      public void setSex(Integer sex) {
          this.sex = sex;
      }

    @Override
    public String toString() {
        return "User{" +
              "id=" + id +
                  ", name=" + name +
                  ", createTime=" + createTime +
                  ", nickName=" + nickName +
                  ", age=" + age +
                  ", address=" + address +
                  ", email=" + email +
                  ", telPhone=" + telPhone +
                  ", sex=" + sex +
              "}";
    }
}
