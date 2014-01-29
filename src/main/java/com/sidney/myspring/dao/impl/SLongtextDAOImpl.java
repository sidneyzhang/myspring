package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SLongtextDAO;
import com.sidney.myspring.repository.ibatis.SLongtext;
import com.sidney.myspring.repository.ibatis.SLongtextCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SLongtextDAOImpl extends SqlMapClientDaoSupport implements SLongtextDAO {

    @Autowired
    public SLongtextDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SLongtextCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_LONGTEXT.countByExample", example);
        return count;
    }

    public int deleteByExample(SLongtextCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_LONGTEXT.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SLongtext key = new SLongtext();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_LONGTEXT.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SLongtext record) {
        this.getSqlMapClientTemplate().insert("S_LONGTEXT.insert", record);
    }

    public void insertSelective(SLongtext record) {
        this.getSqlMapClientTemplate().insert("S_LONGTEXT.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SLongtext> selectByExample(SLongtextCriteria example) {
        List<SLongtext> list = this.getSqlMapClientTemplate().queryForList("S_LONGTEXT.selectByExample", example);
        return list;
    }

    public SLongtext selectByPrimaryKey(Integer id) {
        SLongtext key = new SLongtext();
        key.setId(id);
        SLongtext record = (SLongtext) this.getSqlMapClientTemplate().queryForObject("S_LONGTEXT.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SLongtext record, SLongtextCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_LONGTEXT.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SLongtext record, SLongtextCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_LONGTEXT.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SLongtext record) {
        int rows = this.getSqlMapClientTemplate().update("S_LONGTEXT.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SLongtext record) {
        int rows = this.getSqlMapClientTemplate().update("S_LONGTEXT.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SLongtextCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SLongtextCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}