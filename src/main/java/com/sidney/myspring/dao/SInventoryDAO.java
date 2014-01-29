package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SInventory;
import com.sidney.myspring.repository.ibatis.SInventoryCriteria;
import com.sidney.myspring.repository.ibatis.SInventoryKey;
import java.util.List;

public interface SInventoryDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SInventoryCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SInventoryCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(SInventoryKey key);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SInventory record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SInventory record);

    /**
     * 根据条件查询记录集
     */
    List<SInventory> selectByExample(SInventoryCriteria example);

    /**
     * 根据主键查询记录
     */
    SInventory selectByPrimaryKey(SInventoryKey key);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SInventory record, SInventoryCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SInventory record, SInventoryCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SInventory record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SInventory record);
}