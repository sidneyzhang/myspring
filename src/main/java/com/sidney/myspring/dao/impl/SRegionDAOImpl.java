package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SRegionDAO;
import com.sidney.myspring.repository.ibatis.SRegion;
import com.sidney.myspring.repository.ibatis.SRegionCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SRegionDAOImpl extends SqlMapClientDaoSupport implements SRegionDAO {

    @Autowired
    public SRegionDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SRegionCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_REGION.countByExample", example);
        return count;
    }

    public int deleteByExample(SRegionCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_REGION.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SRegion key = new SRegion();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_REGION.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SRegion record) {
        this.getSqlMapClientTemplate().insert("S_REGION.insert", record);
    }

    public void insertSelective(SRegion record) {
        this.getSqlMapClientTemplate().insert("S_REGION.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SRegion> selectByExample(SRegionCriteria example) {
        List<SRegion> list = this.getSqlMapClientTemplate().queryForList("S_REGION.selectByExample", example);
        return list;
    }

    public SRegion selectByPrimaryKey(Integer id) {
        SRegion key = new SRegion();
        key.setId(id);
        SRegion record = (SRegion) this.getSqlMapClientTemplate().queryForObject("S_REGION.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SRegion record, SRegionCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_REGION.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SRegion record, SRegionCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_REGION.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SRegion record) {
        int rows = this.getSqlMapClientTemplate().update("S_REGION.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SRegion record) {
        int rows = this.getSqlMapClientTemplate().update("S_REGION.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SRegionCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SRegionCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}