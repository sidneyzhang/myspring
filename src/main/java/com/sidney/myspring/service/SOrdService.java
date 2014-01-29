package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SOrd;
import com.sidney.myspring.repository.ibatis.SOrdCriteria;
import java.util.List;

public interface SOrdService {
    int countByExample(SOrdCriteria example);

    SOrd selectByPrimaryKey(Integer id);

    List<SOrd> selectByExample(SOrdCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SOrd record);

    Result updateByPrimaryKey(SOrd record);

    Result deleteByExample(SOrdCriteria example);

    Result updateByExampleSelective(SOrd record, SOrdCriteria example);

    Result updateByExample(SOrd record, SOrdCriteria example);

    Result insert(SOrd record);

    Result insertSelective(SOrd record);
}