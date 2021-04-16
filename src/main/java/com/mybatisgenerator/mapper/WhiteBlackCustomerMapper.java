package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.WhiteBlackCustomer;

public interface WhiteBlackCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WhiteBlackCustomer record);

    int insertSelective(WhiteBlackCustomer record);

    WhiteBlackCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WhiteBlackCustomer record);

    int updateByPrimaryKey(WhiteBlackCustomer record);
}