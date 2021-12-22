package com.ycx.demo.controller;


import com.ycx.demo.common.Result;
import com.ycx.demo.entity.User;
import com.ycx.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * user information table 前端控制器
 * </p>
 *
 * @author pst
 * @since 2021-12-19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    IUserService iUserService;

    @PostMapping
    public Result<?> save(@RequestBody User user) {
        iUserService.save(user);
        return Result.success();
    }
}
