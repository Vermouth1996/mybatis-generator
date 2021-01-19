package com.mybatisgenerator.model;

import java.util.Date;

public class OpEditTagEvent {
    private Long id;

    private String externalUserId;

    private String followUserId;

    private Integer enterpriseId;

    private Integer operateStatus;

    private Date createTime;

    private Date updateTime;

    public OpEditTagEvent(Long id, String externalUserId, String followUserId, Integer enterpriseId, Integer operateStatus, Date createTime, Date updateTime) {
        this.id = id;
        this.externalUserId = externalUserId;
        this.followUserId = followUserId;
        this.enterpriseId = enterpriseId;
        this.operateStatus = operateStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OpEditTagEvent() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId == null ? null : externalUserId.trim();
    }

    public String getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(String followUserId) {
        this.followUserId = followUserId == null ? null : followUserId.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
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
}