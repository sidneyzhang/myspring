package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SOrd;
import com.sidney.myspring.repository.ibatis.SOrdCriteria;
import java.util.List;

public interface SOrdDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SOrdCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SOrdCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SOrd record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SOrd record);

    /**
     * 根据条件查询记录集
     */
    List<SOrd> selectByExample(SOrdCriteria example);

    /**
     * 根据主键查询记录
     */
    SOrd selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SOrd record, SOrdCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SOrd record, SOrdCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SOrd record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SOrd record);
}