package com.ycx.demo.service.impl;

import com.ycx.demo.entity.User;
import com.ycx.demo.mapper.UserMapper;
import com.ycx.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * user information table 服务实现类
 * </p>
 *
 * @author pst
 * @since 2021-12-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
