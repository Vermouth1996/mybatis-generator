package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class GroupAnnouncementTask implements Serializable {
    private Integer id;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务类型 0-实时发布 1-定时发布
     */
    private Integer taskType;

    /**
     * 任务执行状态 0-待执行 1-执行中 2-已完成 3-已停止
     */
    private Integer taskStatus;

    /**
     * 创建人Id
     */
    private Integer createUserId;

    /**
     * 创建人姓名
     */
    private String createUserName;

    /**
     * 企业Id
     */
    private Integer enterpriseId;

    /**
     * 任务style 0-自建任务 1-重发任务
     */
    private Integer taskStyle;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getTaskStyle() {
        return taskStyle;
    }

    public void setTaskStyle(Integer taskStyle) {
        this.taskStyle = taskStyle;
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