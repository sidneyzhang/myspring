package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SImageDAO;
import com.sidney.myspring.repository.ibatis.SImage;
import com.sidney.myspring.repository.ibatis.SImageCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SImageDAOImpl extends SqlMapClientDaoSupport implements SImageDAO {

    @Autowired
    public SImageDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SImageCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_IMAGE.countByExample", example);
        return count;
    }

    public int deleteByExample(SImageCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_IMAGE.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SImage key = new SImage();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_IMAGE.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SImage record) {
        this.getSqlMapClientTemplate().insert("S_IMAGE.insert", record);
    }

    public void insertSelective(SImage record) {
        this.getSqlMapClientTemplate().insert("S_IMAGE.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SImage> selectByExampleWithBLOBs(SImageCriteria example) {
        List<SImage> list = this.getSqlMapClientTemplate().queryForList("S_IMAGE.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<SImage> selectByExampleWithoutBLOBs(SImageCriteria example) {
        List<SImage> list = this.getSqlMapClientTemplate().queryForList("S_IMAGE.selectByExample", example);
        return list;
    }

    public SImage selectByPrimaryKey(Integer id) {
        SImage key = new SImage();
        key.setId(id);
        SImage record = (SImage) this.getSqlMapClientTemplate().queryForObject("S_IMAGE.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SImage record, SImageCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(SImage record, SImageCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(SImage record, SImageCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SImage record) {
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(SImage record) {
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(SImage record) {
        int rows = this.getSqlMapClientTemplate().update("S_IMAGE.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SImageCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SImageCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}