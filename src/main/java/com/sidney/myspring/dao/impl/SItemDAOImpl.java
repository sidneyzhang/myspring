package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SItemDAO;
import com.sidney.myspring.repository.ibatis.SItem;
import com.sidney.myspring.repository.ibatis.SItemCriteria;
import com.sidney.myspring.repository.ibatis.SItemKey;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SItemDAOImpl extends SqlMapClientDaoSupport implements SItemDAO {

    @Autowired
    public SItemDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SItemCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_ITEM.countByExample", example);
        return count;
    }

    public int deleteByExample(SItemCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_ITEM.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(SItemKey key) {
        int rows = this.getSqlMapClientTemplate().delete("S_ITEM.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SItem record) {
        this.getSqlMapClientTemplate().insert("S_ITEM.insert", record);
    }

    public void insertSelective(SItem record) {
        this.getSqlMapClientTemplate().insert("S_ITEM.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SItem> selectByExample(SItemCriteria example) {
        List<SItem> list = this.getSqlMapClientTemplate().queryForList("S_ITEM.selectByExample", example);
        return list;
    }

    public SItem selectByPrimaryKey(SItemKey key) {
        SItem record = (SItem) this.getSqlMapClientTemplate().queryForObject("S_ITEM.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SItem record, SItemCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_ITEM.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SItem record, SItemCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_ITEM.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SItem record) {
        int rows = this.getSqlMapClientTemplate().update("S_ITEM.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SItem record) {
        int rows = this.getSqlMapClientTemplate().update("S_ITEM.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SItemCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SItemCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}