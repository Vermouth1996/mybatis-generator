package com.mybatisgenerator.mapper;

public interface OpEditTagEventMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OpEditTagEvent record);

    int insertSelective(OpEditTagEvent record);

    OpEditTagEvent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OpEditTagEvent record);

    int updateByPrimaryKey(OpEditTagEvent record);
}