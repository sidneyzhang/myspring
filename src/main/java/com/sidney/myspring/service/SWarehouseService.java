package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SWarehouse;
import com.sidney.myspring.repository.ibatis.SWarehouseCriteria;
import java.util.List;

public interface SWarehouseService {
    int countByExample(SWarehouseCriteria example);

    SWarehouse selectByPrimaryKey(Integer id);

    List<SWarehouse> selectByExample(SWarehouseCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SWarehouse record);

    Result updateByPrimaryKey(SWarehouse record);

    Result deleteByExample(SWarehouseCriteria example);

    Result updateByExampleSelective(SWarehouse record, SWarehouseCriteria example);

    Result updateByExample(SWarehouse record, SWarehouseCriteria example);

    Result insert(SWarehouse record);

    Result insertSelective(SWarehouse record);
}