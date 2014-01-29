package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.STitle;
import com.sidney.myspring.repository.ibatis.STitleCriteria;
import java.util.List;

public interface STitleDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(STitleCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(STitleCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(String title);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(STitle record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(STitle record);

    /**
     * 根据条件查询记录集
     */
    List<STitle> selectByExample(STitleCriteria example);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(STitle record, STitleCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(STitle record, STitleCriteria example);
}