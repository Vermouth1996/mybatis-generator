package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.OpDeleteFollowuserLog;

public interface OpDeleteFollowuserLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpDeleteFollowuserLog record);

    int insertSelective(OpDeleteFollowuserLog record);

    OpDeleteFollowuserLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpDeleteFollowuserLog record);

    int updateByPrimaryKey(OpDeleteFollowuserLog record);
}