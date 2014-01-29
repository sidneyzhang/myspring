package com.sidney.myspring.dao;

import com.sidney.myspring.repository.ibatis.SImage;
import com.sidney.myspring.repository.ibatis.SImageCriteria;
import java.util.List;

public interface SImageDAO {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SImageCriteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SImageCriteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    void insert(SImage record);

    /**
     * 保存属性不为空的记录
     */
    void insertSelective(SImage record);

    /**
     * 根据条件查询记录集
     */
    List<SImage> selectByExampleWithBLOBs(SImageCriteria example);

    /**
     * 根据条件查询记录集
     */
    List<SImage> selectByExampleWithoutBLOBs(SImageCriteria example);

    /**
     * 根据主键查询记录
     */
    SImage selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(SImage record, SImageCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithBLOBs(SImage record, SImageCriteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithoutBLOBs(SImage record, SImageCriteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SImage record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(SImage record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithoutBLOBs(SImage record);
}