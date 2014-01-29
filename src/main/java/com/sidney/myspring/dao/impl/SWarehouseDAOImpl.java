package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SWarehouseDAO;
import com.sidney.myspring.repository.ibatis.SWarehouse;
import com.sidney.myspring.repository.ibatis.SWarehouseCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SWarehouseDAOImpl extends SqlMapClientDaoSupport implements SWarehouseDAO {

    @Autowired
    public SWarehouseDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SWarehouseCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_WAREHOUSE.countByExample", example);
        return count;
    }

    public int deleteByExample(SWarehouseCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_WAREHOUSE.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SWarehouse key = new SWarehouse();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_WAREHOUSE.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SWarehouse record) {
        this.getSqlMapClientTemplate().insert("S_WAREHOUSE.insert", record);
    }

    public void insertSelective(SWarehouse record) {
        this.getSqlMapClientTemplate().insert("S_WAREHOUSE.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SWarehouse> selectByExampleWithBLOBs(SWarehouseCriteria example) {
        List<SWarehouse> list = this.getSqlMapClientTemplate().queryForList("S_WAREHOUSE.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<SWarehouse> selectByExampleWithoutBLOBs(SWarehouseCriteria example) {
        List<SWarehouse> list = this.getSqlMapClientTemplate().queryForList("S_WAREHOUSE.selectByExample", example);
        return list;
    }

    public SWarehouse selectByPrimaryKey(Integer id) {
        SWarehouse key = new SWarehouse();
        key.setId(id);
        SWarehouse record = (SWarehouse) this.getSqlMapClientTemplate().queryForObject("S_WAREHOUSE.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SWarehouse record, SWarehouseCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(SWarehouse record, SWarehouseCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(SWarehouse record, SWarehouseCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SWarehouse record) {
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(SWarehouse record) {
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(SWarehouse record) {
        int rows = this.getSqlMapClientTemplate().update("S_WAREHOUSE.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SWarehouseCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SWarehouseCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}