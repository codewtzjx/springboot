package com.example.oristand.controller;

import com.service.UserService;
import com.spring.demo.springbootexample.mybatis.mapper.TbSysUserMapper;
import com.spring.demo.springbootexample.mybatis.po.TbSysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright 2019 Oriental Standard All rights reserved.
 *
 * @Author: WuTieZhu
 * @ClassName ViewController
 * @CreateTime 2019/11/5 19:35
 * @Description: TODO
 */
@Controller
@RequestMapping("/test")
public class ViewController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    @ResponseBody
    public TbSysUser testSpringBoot() {
        TbSysUser tbSysUser = userService.getUser(1);

        return tbSysUser;
    }
}
