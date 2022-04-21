package com.hty.htyjavaadmin.service.impl;

import com.hty.htyjavaadmin.entity.User;
import com.hty.htyjavaadmin.mapper.UserMapper;
import com.hty.htyjavaadmin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xzy
 * @since 2022-04-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
