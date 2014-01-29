package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SDept;
import com.sidney.myspring.repository.ibatis.SDeptCriteria;
import java.util.List;

public interface SDeptDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SDeptCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SDeptCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SDept record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SDept record);

    /**
     * 根据条件查询记录集
     */
    List<SDept> selectByExample(SDeptCriteria example);

    /**
     * 根据主键查询记录
     */
    SDept selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SDept record, SDeptCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SDept record, SDeptCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SDept record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SDept record);
}