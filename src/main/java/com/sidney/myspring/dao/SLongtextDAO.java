package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SLongtext;
import com.sidney.myspring.repository.ibatis.SLongtextCriteria;
import java.util.List;

public interface SLongtextDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SLongtextCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SLongtextCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SLongtext record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SLongtext record);

    /**
     * 根据条件查询记录集
     */
    List<SLongtext> selectByExample(SLongtextCriteria example);

    /**
     * 根据主键查询记录
     */
    SLongtext selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SLongtext record, SLongtextCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(SLongtext record, SLongtextCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SLongtext record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SLongtext record);
}