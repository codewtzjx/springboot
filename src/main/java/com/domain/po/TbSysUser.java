package com.domain.po;

import java.util.Date;

public class TbSysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.login_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.username
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.password
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.department_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Integer departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.status
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.login_limit
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Integer loginLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.expiration_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Date expirationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.email
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.mobile_phone
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.tel
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.customer_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.memo
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.create_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.create_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.update_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private String updateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.update_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.id
     *
     * @return the value of tb_sys_user.id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.id
     *
     * @param id the value for tb_sys_user.id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.login_name
     *
     * @return the value of tb_sys_user.login_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.login_name
     *
     * @param loginName the value for tb_sys_user.login_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.username
     *
     * @return the value of tb_sys_user.username
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.username
     *
     * @param username the value for tb_sys_user.username
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.password
     *
     * @return the value of tb_sys_user.password
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.password
     *
     * @param password the value for tb_sys_user.password
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.department_id
     *
     * @return the value of tb_sys_user.department_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.department_id
     *
     * @param departmentId the value for tb_sys_user.department_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.status
     *
     * @return the value of tb_sys_user.status
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.status
     *
     * @param status the value for tb_sys_user.status
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.login_limit
     *
     * @return the value of tb_sys_user.login_limit
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Integer getLoginLimit() {
        return loginLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.login_limit
     *
     * @param loginLimit the value for tb_sys_user.login_limit
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setLoginLimit(Integer loginLimit) {
        this.loginLimit = loginLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.expiration_time
     *
     * @return the value of tb_sys_user.expiration_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.expiration_time
     *
     * @param expirationTime the value for tb_sys_user.expiration_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.email
     *
     * @return the value of tb_sys_user.email
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.email
     *
     * @param email the value for tb_sys_user.email
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.mobile_phone
     *
     * @return the value of tb_sys_user.mobile_phone
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.mobile_phone
     *
     * @param mobilePhone the value for tb_sys_user.mobile_phone
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.tel
     *
     * @return the value of tb_sys_user.tel
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.tel
     *
     * @param tel the value for tb_sys_user.tel
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.customer_id
     *
     * @return the value of tb_sys_user.customer_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.customer_id
     *
     * @param customerId the value for tb_sys_user.customer_id
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.memo
     *
     * @return the value of tb_sys_user.memo
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.memo
     *
     * @param memo the value for tb_sys_user.memo
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.create_user_name
     *
     * @return the value of tb_sys_user.create_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.create_user_name
     *
     * @param createUserName the value for tb_sys_user.create_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.create_time
     *
     * @return the value of tb_sys_user.create_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.create_time
     *
     * @param createTime the value for tb_sys_user.create_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.update_user_name
     *
     * @return the value of tb_sys_user.update_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.update_user_name
     *
     * @param updateUserName the value for tb_sys_user.update_user_name
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.update_time
     *
     * @return the value of tb_sys_user.update_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.update_time
     *
     * @param updateTime the value for tb_sys_user.update_time
     *
     * @mbggenerated Wed Nov 06 18:10:11 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}