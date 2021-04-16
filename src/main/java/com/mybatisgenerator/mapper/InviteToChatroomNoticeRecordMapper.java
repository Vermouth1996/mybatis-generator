package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.InviteToChatroomNoticeRecord;

public interface InviteToChatroomNoticeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InviteToChatroomNoticeRecord record);

    int insertSelective(InviteToChatroomNoticeRecord record);

    InviteToChatroomNoticeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InviteToChatroomNoticeRecord record);

    int updateByPrimaryKey(InviteToChatroomNoticeRecord record);
}