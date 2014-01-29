package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SRegion;
import com.sidney.myspring.repository.ibatis.SRegionCriteria;
import java.util.List;

public interface SRegionDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SRegionCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SRegionCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SRegion record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SRegion record);

    /**
     * 根据条件查询记录集
     */
    List<SRegion> selectByExample(SRegionCriteria example);

    /**
     * 根据主键查询记录
     */
    SRegion selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SRegion record, SRegionCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SRegion record, SRegionCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SRegion record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SRegion record);
}