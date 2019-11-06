package com.spring.demo.springbootexample.mybatis.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
@Data
public class TbSysUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.id
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.login_name
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.username
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.password
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.department_id
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Integer departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.status
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.login_limit
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Integer loginLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.expiration_time
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Date expirationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.email
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.mobile_phone
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.tel
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.customer_id
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.memo
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.create_user_name
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.create_time
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.update_user_name
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private String updateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.update_time
     *
     * @mbggenerated Wed Nov 06 09:52:15 CST 2019
     */
    private Date updateTime;
}