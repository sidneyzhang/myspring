package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SImage;
import com.sidney.myspring.repository.ibatis.SImageCriteria;
import java.util.List;

public interface SImageService {
    int countByExample(SImageCriteria example);

    SImage selectByPrimaryKey(Integer id);

    List<SImage> selectByExample(SImageCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SImage record);

    Result updateByPrimaryKey(SImage record);

    Result deleteByExample(SImageCriteria example);

    Result updateByExampleSelective(SImage record, SImageCriteria example);

    Result updateByExample(SImage record, SImageCriteria example);

    Result insert(SImage record);

    Result insertSelective(SImage record);
}