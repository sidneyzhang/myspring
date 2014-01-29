package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SCustomerDAO;
import com.sidney.myspring.repository.ibatis.SCustomer;
import com.sidney.myspring.repository.ibatis.SCustomerCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SCustomerDAOImpl extends SqlMapClientDaoSupport implements SCustomerDAO {

    @Autowired
    public SCustomerDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SCustomerCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_CUSTOMER.countByExample", example);
        return count;
    }

    public int deleteByExample(SCustomerCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_CUSTOMER.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SCustomer key = new SCustomer();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_CUSTOMER.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SCustomer record) {
        this.getSqlMapClientTemplate().insert("S_CUSTOMER.insert", record);
    }

    public void insertSelective(SCustomer record) {
        this.getSqlMapClientTemplate().insert("S_CUSTOMER.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SCustomer> selectByExample(SCustomerCriteria example) {
        List<SCustomer> list = this.getSqlMapClientTemplate().queryForList("S_CUSTOMER.selectByExample", example);
        return list;
    }

    public SCustomer selectByPrimaryKey(Integer id) {
        SCustomer key = new SCustomer();
        key.setId(id);
        SCustomer record = (SCustomer) this.getSqlMapClientTemplate().queryForObject("S_CUSTOMER.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SCustomer record, SCustomerCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_CUSTOMER.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SCustomer record, SCustomerCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_CUSTOMER.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SCustomer record) {
        int rows = this.getSqlMapClientTemplate().update("S_CUSTOMER.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SCustomer record) {
        int rows = this.getSqlMapClientTemplate().update("S_CUSTOMER.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SCustomerCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SCustomerCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}