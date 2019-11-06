package com.service;

import com.spring.demo.springbootexample.mybatis.po.TbSysUser;

/**
 * Copyright 2019 Oriental Standard All rights reserved.
 *
 * @Author: WuTieZhu
 * @ClassName UserService
 * @CreateTime 2019/11/6 10:20
 * @Description: TODO
 */
public interface UserService {

    TbSysUser getUser(Integer id);
}
