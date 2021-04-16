package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.GroupAnnouncementInfo;

public interface GroupAnnouncementInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupAnnouncementInfo record);

    int insertSelective(GroupAnnouncementInfo record);

    GroupAnnouncementInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupAnnouncementInfo record);

    int updateByPrimaryKey(GroupAnnouncementInfo record);
}