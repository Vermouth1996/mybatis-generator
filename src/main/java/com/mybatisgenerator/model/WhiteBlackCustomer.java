package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class WhiteBlackCustomer implements Serializable {
    private Integer id;

    /**
     * 企业id
     */
    private Integer enterpriseId;

    /**
     * 客户user_id
     */
    private String customerUserId;

    private Date createTime;

    private Date updateTime;

    private Byte isDelete;

    /**
     * 0-普通,1-白名单,2-黑名单
     */
    private Integer status;

    /**
     * 添加黑白名单时间
     */
    private Date joinTime;

    /**
     * 添加方式0-手动，1-违规
     */
    private Integer joinWay;

    private String wechatId;

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

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId == null ? null : customerUserId.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getJoinWay() {
        return joinWay;
    }

    public void setJoinWay(Integer joinWay) {
        this.joinWay = joinWay;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }
}