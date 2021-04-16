package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class InviteToChatroomNoticeRecord implements Serializable {
    private Integer id;

    private Integer taskId;

    /**
     * 发送内容的群内人数阈值
     */
    private Integer sendMessageThreshold;

    /**
     * 通知群主的群内人数阈值
     */
    private Integer noticeChatOwnerThreshold;

    /**
     * 发送内容
     */
    private String messageContent;

    /**
     * 是否艾特所有人 0-否 1-是
     */
    private Integer isNoticeAll;

    /**
     * 发送状态 0-未发送 1-已发送 2-发送失败
     */
    private Integer sendStatus;

    private Date createTime;

    private Date updateTime;

    /**
     * 探鲸群聊Id
     */
    private String groupSerialNo;

    /**
     * 企微群聊Id
     */
    private String chatId;

    /**
     * 删除标记Id  0-未删除 其他值(与主键相同的值)-已删除
     */
    private Integer deleteMarkId;

    private Integer enterpriseId;

    /**
     * 群主企微号Id
     */
    private String chatOwnerId;

    /**
     * 邀请人的企微Id
     */
    private String inviterId;

    /**
     * 发送消息的recordId
     */
    private String recordId;

    private String remark;

    /**
     * 通知群主状态 0-待通知 1-已通知 2-失败
     */
    private Integer noticeGroupOwnerStatus;

    /**
     * 群聊名称
     */
    private String chatName;

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

    public Integer getSendMessageThreshold() {
        return sendMessageThreshold;
    }

    public void setSendMessageThreshold(Integer sendMessageThreshold) {
        this.sendMessageThreshold = sendMessageThreshold;
    }

    public Integer getNoticeChatOwnerThreshold() {
        return noticeChatOwnerThreshold;
    }

    public void setNoticeChatOwnerThreshold(Integer noticeChatOwnerThreshold) {
        this.noticeChatOwnerThreshold = noticeChatOwnerThreshold;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Integer getIsNoticeAll() {
        return isNoticeAll;
    }

    public void setIsNoticeAll(Integer isNoticeAll) {
        this.isNoticeAll = isNoticeAll;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
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

    public String getGroupSerialNo() {
        return groupSerialNo;
    }

    public void setGroupSerialNo(String groupSerialNo) {
        this.groupSerialNo = groupSerialNo == null ? null : groupSerialNo.trim();
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId == null ? null : chatId.trim();
    }

    public Integer getDeleteMarkId() {
        return deleteMarkId;
    }

    public void setDeleteMarkId(Integer deleteMarkId) {
        this.deleteMarkId = deleteMarkId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getChatOwnerId() {
        return chatOwnerId;
    }

    public void setChatOwnerId(String chatOwnerId) {
        this.chatOwnerId = chatOwnerId == null ? null : chatOwnerId.trim();
    }

    public String getInviterId() {
        return inviterId;
    }

    public void setInviterId(String inviterId) {
        this.inviterId = inviterId == null ? null : inviterId.trim();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getNoticeGroupOwnerStatus() {
        return noticeGroupOwnerStatus;
    }

    public void setNoticeGroupOwnerStatus(Integer noticeGroupOwnerStatus) {
        this.noticeGroupOwnerStatus = noticeGroupOwnerStatus;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName == null ? null : chatName.trim();
    }
}