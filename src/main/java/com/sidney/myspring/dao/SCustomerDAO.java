package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SCustomer;
import com.sidney.myspring.repository.ibatis.SCustomerCriteria;
import java.util.List;

public interface SCustomerDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SCustomerCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SCustomerCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SCustomer record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SCustomer record);

    /**
     * 根据条件查询记录集
     */
    List<SCustomer> selectByExample(SCustomerCriteria example);

    /**
     * 根据主键查询记录
     */
    SCustomer selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SCustomer record, SCustomerCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SCustomer record, SCustomerCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SCustomer record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SCustomer record);
}