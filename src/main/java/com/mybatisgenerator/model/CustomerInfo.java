package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class CustomerInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 企业id
     */
    private Integer enterpriseId;

    /**
     * 员工id
     */
    private String wechatId;

    /**
     * 客户user_id
     */
    private String customerUserId;

    /**
     * 1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
     */
    private Integer type;

    /**
     * 
     */
    private String name;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别 0-未知 1-男性 2-女性
     */
    private Byte gender;

    /**
     * 
     */
    private String customerDetail;

    /**
     * 客户unionId
     */
    private String customerUnionid;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Byte isDelete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId == null ? null : customerUserId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(String customerDetail) {
        this.customerDetail = customerDetail == null ? null : customerDetail.trim();
    }

    public String getCustomerUnionid() {
        return customerUnionid;
    }

    public void setCustomerUnionid(String customerUnionid) {
        this.customerUnionid = customerUnionid == null ? null : customerUnionid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}