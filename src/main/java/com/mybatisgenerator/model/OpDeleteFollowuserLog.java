package com.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class OpDeleteFollowuserLog implements Serializable {
    private Integer id;

    private Integer enterpriseId;

    /**
     * 外部联系人id
     */
    private String externalUserid;

    /**
     * 外部联系人名称
     */
    private String externalName;

    /**
     * 外部联系人备注
     */
    private String externalRemark;

    /**
     * 添加类型
     */
    private Integer type;

    /**
     * 外部联系人头像
     */
    private String avatar;

    /**
     * 外部联系人性别
     */
    private Integer gender;

    /**
     * 外部联系人标签
     */
    private String tagNames;

    /**
     * 外部联系人标签json串原数据
     */
    private String tags;

    /**
     * 外部联系人备注手机号
     */
    private String remarkMobiles;

    private Integer addWay;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 企业联系人id
     */
    private String followUserid;

    /**
     * 企业联系人名称
     */
    private String followName;

    /**
     * 0 客户删除企业用户 1 客户加回企业用户 2企业用户删除客户
     */
    private Integer status;

    /**
     * 是否删除 0-否 1-是
     */
    private Byte isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

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

    public String getExternalUserid() {
        return externalUserid;
    }

    public void setExternalUserid(String externalUserid) {
        this.externalUserid = externalUserid == null ? null : externalUserid.trim();
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName == null ? null : externalName.trim();
    }

    public String getExternalRemark() {
        return externalRemark;
    }

    public void setExternalRemark(String externalRemark) {
        this.externalRemark = externalRemark == null ? null : externalRemark.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTagNames() {
        return tagNames;
    }

    public void setTagNames(String tagNames) {
        this.tagNames = tagNames == null ? null : tagNames.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getRemarkMobiles() {
        return remarkMobiles;
    }

    public void setRemarkMobiles(String remarkMobiles) {
        this.remarkMobiles = remarkMobiles == null ? null : remarkMobiles.trim();
    }

    public Integer getAddWay() {
        return addWay;
    }

    public void setAddWay(Integer addWay) {
        this.addWay = addWay;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getFollowUserid() {
        return followUserid;
    }

    public void setFollowUserid(String followUserid) {
        this.followUserid = followUserid == null ? null : followUserid.trim();
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName == null ? null : followName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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