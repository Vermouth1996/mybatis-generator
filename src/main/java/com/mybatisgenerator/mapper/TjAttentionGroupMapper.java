package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.TjAttentionGroup;

public interface TjAttentionGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TjAttentionGroup record);

    int insertSelective(TjAttentionGroup record);

    TjAttentionGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TjAttentionGroup record);

    int updateByPrimaryKey(TjAttentionGroup record);
}