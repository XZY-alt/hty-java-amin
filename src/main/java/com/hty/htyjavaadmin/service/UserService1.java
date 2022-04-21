package com.hty.htyjavaadmin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.htyjavaadmin.entity.User1;
import com.hty.htyjavaadmin.mapper.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService1 extends ServiceImpl<UserMapper1, User1> {
    @Autowired
    UserMapper1 UserMapper;

    @Autowired
    UserService1 userService;

    //自定义的方法
    public int save1(User1 user){
        if(user.getId()==null){
            return UserMapper.insert(user);
        }else{
            return UserMapper.update(user);
        }
    }

    //获取所有用户信息,测试mybatis-plus是否有用
    public Boolean savaUserMybitisPlus(User1 user){
       return save(user);
    }


}
