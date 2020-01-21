package com.controller;

import com.domain.mapper.TbSysUserMapper;
import com.domain.po.TbSysUser;
import com.domain.po.TbSysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright 2019 Oriental Standard All rights reserved.
 *
 * @Author: WuTieZhu
 * @ClassName AllTestController
 * @CreateTime 2019/11/5 19:35
 * @Description: TODO
 */
@Controller
@RequestMapping("/wangfawei1")
public class AllTestController {

    @Autowired
    private TbSysUserMapper sysUserMapper;

    public void getStart() {
        System.out.println("yes1");
    }

}
