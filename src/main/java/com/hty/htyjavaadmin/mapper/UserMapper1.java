package com.hty.htyjavaadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hty.htyjavaadmin.entity.User1;
import org.apache.ibatis.annotations.*;

import java.util.List;


//@Mapper  (去掉mapper)
public interface UserMapper1 extends BaseMapper<User1> {
    //查找
    @Select("select * from tab_user")
    List<User1> findAll();

    //更新用户
    @Update("update tab_user set nickName=#{nickName},address=#{address} where id=#{id}")
    int update(User1 user);

    //增加用户
    @Insert("insert into tab_user(name,nickName,age,address) values (#{name},#{nickName},#{age},#{address})")
    int insert(User1 user);

    //使用动态sql更方便
    int insertUser(User1 user);

    int updataUser(User1 user);

    List<User1> selectPage(Integer pageNum, Integer pageSize);

    @Select("select COUNT(*) from tab_user")
    int selectTotal();

    @Delete("delete from tab_user where id=#{id}")
    int deleteUserById(Integer id);

    List<User1> selectByCondition(String name, String telPhone, String address);

}
