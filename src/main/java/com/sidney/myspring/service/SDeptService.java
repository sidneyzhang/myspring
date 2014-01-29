package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SDept;
import com.sidney.myspring.repository.ibatis.SDeptCriteria;
import java.util.List;

public interface SDeptService {
    int countByExample(SDeptCriteria example);

    SDept selectByPrimaryKey(Integer id);

    List<SDept> selectByExample(SDeptCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SDept record);

    Result updateByPrimaryKey(SDept record);

    Result deleteByExample(SDeptCriteria example);

    Result updateByExampleSelective(SDept record, SDeptCriteria example);

    Result updateByExample(SDept record, SDeptCriteria example);

    Result insert(SDept record);

    Result insertSelective(SDept record);
}