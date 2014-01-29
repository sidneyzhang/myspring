package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SRegion;
import com.sidney.myspring.repository.ibatis.SRegionCriteria;
import java.util.List;

public interface SRegionService {
    int countByExample(SRegionCriteria example);

    SRegion selectByPrimaryKey(Integer id);

    List<SRegion> selectByExample(SRegionCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SRegion record);

    Result updateByPrimaryKey(SRegion record);

    Result deleteByExample(SRegionCriteria example);

    Result updateByExampleSelective(SRegion record, SRegionCriteria example);

    Result updateByExample(SRegion record, SRegionCriteria example);

    Result insert(SRegion record);

    Result insertSelective(SRegion record);
}