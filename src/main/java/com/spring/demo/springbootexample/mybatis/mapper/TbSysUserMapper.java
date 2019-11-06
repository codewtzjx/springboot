package com.spring.demo.springbootexample.mybatis.mapper;

import com.spring.demo.springbootexample.mybatis.po.TbSysUser;
import org.apache.ibatis.annotations.Param;


public interface TbSysUserMapper {
    TbSysUser selectByPrimaryKey(@Param(value = "id") Integer id);
}