package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class GroupAnnouncementRecord implements Serializable {
    private Integer id;

    private Integer taskId;

    /**
     * 企微群Id
     */
    private String groupId;

    /**
     * 探鲸群Id
     */
    private String groupSerialNo;

    private Date createTime;

    private Date updateTime;

    /**
     * 发送记录Id
     */
    private String recordId;

    /**
     * 发送结果标识
     */
    private String sendRemark;

    private Integer sendStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupSerialNo() {
        return groupSerialNo;
    }

    public void setGroupSerialNo(String groupSerialNo) {
        this.groupSerialNo = groupSerialNo == null ? null : groupSerialNo.trim();
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

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getSendRemark() {
        return sendRemark;
    }

    public void setSendRemark(String sendRemark) {
        this.sendRemark = sendRemark == null ? null : sendRemark.trim();
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }
}