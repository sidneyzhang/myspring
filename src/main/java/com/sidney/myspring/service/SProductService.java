package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SProduct;
import com.sidney.myspring.repository.ibatis.SProductCriteria;
import java.util.List;

public interface SProductService {
    int countByExample(SProductCriteria example);

    SProduct selectByPrimaryKey(Integer id);

    List<SProduct> selectByExample(SProductCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SProduct record);

    Result updateByPrimaryKey(SProduct record);

    Result deleteByExample(SProductCriteria example);

    Result updateByExampleSelective(SProduct record, SProductCriteria example);

    Result updateByExample(SProduct record, SProductCriteria example);

    Result insert(SProduct record);

    Result insertSelective(SProduct record);
}