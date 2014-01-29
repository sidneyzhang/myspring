package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.STitle;
import com.sidney.myspring.repository.ibatis.STitleCriteria;
import java.util.List;

public interface STitleService {
    int countByExample(STitleCriteria example);

    STitle selectByPrimaryKey(String title);

    List<STitle> selectByExample(STitleCriteria example);

    Result deleteByPrimaryKey(String title);

    Result updateByPrimaryKeySelective(STitle record);

    Result updateByPrimaryKey(STitle record);

    Result deleteByExample(STitleCriteria example);

    Result updateByExampleSelective(STitle record, STitleCriteria example);

    Result updateByExample(STitle record, STitleCriteria example);

    Result insert(STitle record);

    Result insertSelective(STitle record);
}