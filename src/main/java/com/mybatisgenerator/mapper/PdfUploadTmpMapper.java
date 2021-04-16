package com.mybatisgenerator.mapper;

import com.mybatisgenerator.model.PdfUploadTmp;

public interface PdfUploadTmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PdfUploadTmp record);

    int insertSelective(PdfUploadTmp record);

    PdfUploadTmp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PdfUploadTmp record);

    int updateByPrimaryKey(PdfUploadTmp record);
}