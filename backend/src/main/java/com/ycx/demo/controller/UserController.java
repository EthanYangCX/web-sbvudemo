package com.ycx.demo.controller;

import com.ycx.demo.common.Result;
import com.ycx.demo.entity.User;
import com.ycx.demo.mapper.UserMapper;
import com.ycx.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping
    public Result<?> save(@RequestBody User user) {
        userService.insert(user);
        return Result.success();
    }
}
