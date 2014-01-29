package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SItem;
import com.sidney.myspring.repository.ibatis.SItemCriteria;
import com.sidney.myspring.repository.ibatis.SItemKey;
import java.util.List;

public interface SItemDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SItemCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SItemCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(SItemKey key);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SItem record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SItem record);

    /**
     * 根据条件查询记录集
     */
    List<SItem> selectByExample(SItemCriteria example);

    /**
     * 根据主键查询记录
     */
    SItem selectByPrimaryKey(SItemKey key);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SItem record, SItemCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SItem record, SItemCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SItem record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SItem record);
}