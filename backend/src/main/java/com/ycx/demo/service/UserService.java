package com.ycx.demo.service;

import com.ycx.demo.entity.User;
import com.ycx.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public boolean insert(User user) {
        userMapper.insert(user);
        return true;
    }
}
