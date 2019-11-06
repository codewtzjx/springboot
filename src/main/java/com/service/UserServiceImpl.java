package com.service;

import com.spring.demo.springbootexample.mybatis.mapper.TbSysUserMapper;
import com.spring.demo.springbootexample.mybatis.po.TbSysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Copyright 2019 Oriental Standard All rights reserved.
 *
 * @Author: WuTieZhu
 * @ClassName UserService
 * @CreateTime 2019/11/6 10:20
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TbSysUserMapper tbSysUserMapper;
    @Override
    @Transactional
    public TbSysUser getUser(Integer id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }
}
