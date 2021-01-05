package com.alibaobao.mybatisplus.generator.controller;


import com.alibaobao.mybatisplus.generator.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author artist
 * @since 2021-01-05
 */
//@Api("user控制器类")
@RestController
@RequestMapping("/generator/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello mybatisplus!";
    }

    @ApiOperation("User控制类hello2方法")
    @RequestMapping("/hello2")
    public String hello2(@ApiParam("用户名参数") String name){
        return "hello mybatisplus2! "+name;
    }

    @RequestMapping("/v1")
    public User hellov1(){
        return new User();
    }
}

