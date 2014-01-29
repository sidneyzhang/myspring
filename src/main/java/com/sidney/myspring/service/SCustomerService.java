package com.sidney.myspring.service;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SCustomer;
import com.sidney.myspring.repository.ibatis.SCustomerCriteria;
import java.util.List;

public interface SCustomerService {
    int countByExample(SCustomerCriteria example);

    SCustomer selectByPrimaryKey(Integer id);

    List<SCustomer> selectByExample(SCustomerCriteria example);

    Result deleteByPrimaryKey(Integer id);

    Result updateByPrimaryKeySelective(SCustomer record);

    Result updateByPrimaryKey(SCustomer record);

    Result deleteByExample(SCustomerCriteria example);

    Result updateByExampleSelective(SCustomer record, SCustomerCriteria example);

    Result updateByExample(SCustomer record, SCustomerCriteria example);

    Result insert(SCustomer record);

    Result insertSelective(SCustomer record);
}