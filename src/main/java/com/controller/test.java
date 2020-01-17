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
@RequestMapping("/testjx")
public class AllTestController {

    @Autowired
    private TbSysUserMapper sysUserMapper;

    @RequestMapping("/吴铁柱贾香1")
    @ResponseBody
    public TbSysUser testSpringBoot() {
        TbSysUser tbSysUser = sysUserMapper.selectByPrimaryKey(3);
        System.out.println("111");
        System.out.println("222");
        return tbSysUser;
    }
}
