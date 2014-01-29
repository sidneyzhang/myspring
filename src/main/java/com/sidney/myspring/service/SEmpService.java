package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SEmp;
import com.sidney.myspring.repository.ibatis.SEmpCriteria;
import java.util.List;

public interface SEmpService {
    int countByExample(SEmpCriteria example);

    SEmp selectByPrimaryKey(Integer id);

    List<SEmp> selectByExample(SEmpCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SEmp record);

    Result updateByPrimaryKey(SEmp record);

    Result deleteByExample(SEmpCriteria example);

    Result updateByExampleSelective(SEmp record, SEmpCriteria example);

    Result updateByExample(SEmp record, SEmpCriteria example);

    Result insert(SEmp record);

    Result insertSelective(SEmp record);
}