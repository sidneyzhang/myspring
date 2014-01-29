package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SDeptDAO;
import com.sidney.myspring.repository.ibatis.SDept;
import com.sidney.myspring.repository.ibatis.SDeptCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SDeptDAOImpl extends SqlMapClientDaoSupport implements SDeptDAO {

    @Autowired
    public SDeptDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SDeptCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_DEPT.countByExample", example);
        return count;
    }

    public int deleteByExample(SDeptCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_DEPT.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SDept key = new SDept();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_DEPT.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SDept record) {
        this.getSqlMapClientTemplate().insert("S_DEPT.insert", record);
    }

    public void insertSelective(SDept record) {
        this.getSqlMapClientTemplate().insert("S_DEPT.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SDept> selectByExample(SDeptCriteria example) {
        List<SDept> list = this.getSqlMapClientTemplate().queryForList("S_DEPT.selectByExample", example);
        return list;
    }

    public SDept selectByPrimaryKey(Integer id) {
        SDept key = new SDept();
        key.setId(id);
        SDept record = (SDept) this.getSqlMapClientTemplate().queryForObject("S_DEPT.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SDept record, SDeptCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_DEPT.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SDept record, SDeptCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_DEPT.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SDept record) {
        int rows = this.getSqlMapClientTemplate().update("S_DEPT.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SDept record) {
        int rows = this.getSqlMapClientTemplate().update("S_DEPT.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SDeptCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SDeptCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}