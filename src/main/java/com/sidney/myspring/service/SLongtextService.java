package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SLongtext;
import com.sidney.myspring.repository.ibatis.SLongtextCriteria;
import java.util.List;

public interface SLongtextService {
    int countByExample(SLongtextCriteria example);

    SLongtext selectByPrimaryKey(Integer id);

    List<SLongtext> selectByExample(SLongtextCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SLongtext record);

    Result updateByPrimaryKey(SLongtext record);

    Result deleteByExample(SLongtextCriteria example);

    Result updateByExampleSelective(SLongtext record, SLongtextCriteria example);

    Result updateByExample(SLongtext record, SLongtextCriteria example);

    Result insert(SLongtext record);

    Result insertSelective(SLongtext record);
}