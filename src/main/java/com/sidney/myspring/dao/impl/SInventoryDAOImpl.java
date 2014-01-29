package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SInventoryDAO;
import com.sidney.myspring.repository.ibatis.SInventory;
import com.sidney.myspring.repository.ibatis.SInventoryCriteria;
import com.sidney.myspring.repository.ibatis.SInventoryKey;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SInventoryDAOImpl extends SqlMapClientDaoSupport implements SInventoryDAO {

    @Autowired
    public SInventoryDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SInventoryCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_INVENTORY.countByExample", example);
        return count;
    }

    public int deleteByExample(SInventoryCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_INVENTORY.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(SInventoryKey key) {
        int rows = this.getSqlMapClientTemplate().delete("S_INVENTORY.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SInventory record) {
        this.getSqlMapClientTemplate().insert("S_INVENTORY.insert", record);
    }

    public void insertSelective(SInventory record) {
        this.getSqlMapClientTemplate().insert("S_INVENTORY.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SInventory> selectByExample(SInventoryCriteria example) {
        List<SInventory> list = this.getSqlMapClientTemplate().queryForList("S_INVENTORY.selectByExample", example);
        return list;
    }

    public SInventory selectByPrimaryKey(SInventoryKey key) {
        SInventory record = (SInventory) this.getSqlMapClientTemplate().queryForObject("S_INVENTORY.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SInventory record, SInventoryCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_INVENTORY.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SInventory record, SInventoryCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_INVENTORY.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SInventory record) {
        int rows = this.getSqlMapClientTemplate().update("S_INVENTORY.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SInventory record) {
        int rows = this.getSqlMapClientTemplate().update("S_INVENTORY.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SInventoryCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SInventoryCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}