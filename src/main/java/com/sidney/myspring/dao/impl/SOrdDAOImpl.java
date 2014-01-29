package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SOrdDAO;
import com.sidney.myspring.repository.ibatis.SOrd;
import com.sidney.myspring.repository.ibatis.SOrdCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SOrdDAOImpl extends SqlMapClientDaoSupport implements SOrdDAO {

    @Autowired
    public SOrdDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SOrdCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_ORD.countByExample", example);
        return count;
    }

    public int deleteByExample(SOrdCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_ORD.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SOrd key = new SOrd();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_ORD.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SOrd record) {
        this.getSqlMapClientTemplate().insert("S_ORD.insert", record);
    }

    public void insertSelective(SOrd record) {
        this.getSqlMapClientTemplate().insert("S_ORD.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SOrd> selectByExample(SOrdCriteria example) {
        List<SOrd> list = this.getSqlMapClientTemplate().queryForList("S_ORD.selectByExample", example);
        return list;
    }

    public SOrd selectByPrimaryKey(Integer id) {
        SOrd key = new SOrd();
        key.setId(id);
        SOrd record = (SOrd) this.getSqlMapClientTemplate().queryForObject("S_ORD.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SOrd record, SOrdCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_ORD.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SOrd record, SOrdCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_ORD.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SOrd record) {
        int rows = this.getSqlMapClientTemplate().update("S_ORD.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SOrd record) {
        int rows = this.getSqlMapClientTemplate().update("S_ORD.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SOrdCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SOrdCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}