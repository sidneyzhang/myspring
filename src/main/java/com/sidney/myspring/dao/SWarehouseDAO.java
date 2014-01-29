package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SWarehouse;
import com.sidney.myspring.repository.ibatis.SWarehouseCriteria;
import java.util.List;

public interface SWarehouseDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SWarehouseCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SWarehouseCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SWarehouse record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SWarehouse record);

    /**
     * 根据条件查询记录集
     */
    List<SWarehouse> selectByExampleWithBLOBs(SWarehouseCriteria example);

    /**
     * 根据条件查询记录集
     */
    List<SWarehouse> selectByExampleWithoutBLOBs(SWarehouseCriteria example);

    /**
     * 根据主键查询记录
     */
    SWarehouse selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SWarehouse record, SWarehouseCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithBLOBs(SWarehouse record, SWarehouseCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithoutBLOBs(SWarehouse record, SWarehouseCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SWarehouse record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(SWarehouse record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithoutBLOBs(SWarehouse record);
}