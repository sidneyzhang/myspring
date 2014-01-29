package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SProduct;
import com.sidney.myspring.repository.ibatis.SProductCriteria;
import java.util.List;

public interface SProductDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SProductCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SProductCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SProduct record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SProduct record);

    /**
     * 根据条件查询记录集
     */
    List<SProduct> selectByExample(SProductCriteria example);

    /**
     * 根据主键查询记录
     */
    SProduct selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SProduct record, SProductCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SProduct record, SProductCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SProduct record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SProduct record);
}