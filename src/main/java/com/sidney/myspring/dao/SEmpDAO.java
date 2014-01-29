package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SEmp;
import com.sidney.myspring.repository.ibatis.SEmpCriteria;
import java.util.List;

public interface SEmpDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SEmpCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SEmpCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SEmp record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SEmp record);

    /**
     * 根据条件查询记录集
     */
    List<SEmp> selectByExample(SEmpCriteria example);

    /**
     * 根据主键查询记录
     */
    SEmp selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SEmp record, SEmpCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SEmp record, SEmpCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SEmp record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SEmp record);
}