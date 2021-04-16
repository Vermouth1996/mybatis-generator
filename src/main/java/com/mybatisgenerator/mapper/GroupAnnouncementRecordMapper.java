package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.GroupAnnouncementRecord;

public interface GroupAnnouncementRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupAnnouncementRecord record);

    int insertSelective(GroupAnnouncementRecord record);

    GroupAnnouncementRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupAnnouncementRecord record);

    int updateByPrimaryKey(GroupAnnouncementRecord record);
}