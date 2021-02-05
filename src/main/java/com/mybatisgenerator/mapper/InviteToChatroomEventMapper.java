package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.InviteToChatroomEvent;

public interface InviteToChatroomEventMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InviteToChatroomEvent record);

    int insertSelective(InviteToChatroomEvent record);

    InviteToChatroomEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InviteToChatroomEvent record);

    int updateByPrimaryKey(InviteToChatroomEvent record);
}