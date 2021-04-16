package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.GroupAnnouncementTask;

public interface GroupAnnouncementTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupAnnouncementTask record);

    int insertSelective(GroupAnnouncementTask record);

    GroupAnnouncementTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupAnnouncementTask record);

    int updateByPrimaryKey(GroupAnnouncementTask record);
}