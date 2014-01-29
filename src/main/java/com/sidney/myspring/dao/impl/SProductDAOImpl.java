package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SProductDAO;
import com.sidney.myspring.repository.ibatis.SProduct;
import com.sidney.myspring.repository.ibatis.SProductCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SProductDAOImpl extends SqlMapClientDaoSupport implements SProductDAO {

    @Autowired
    public SProductDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SProductCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_PRODUCT.countByExample", example);
        return count;
    }

    public int deleteByExample(SProductCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_PRODUCT.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SProduct key = new SProduct();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_PRODUCT.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SProduct record) {
        this.getSqlMapClientTemplate().insert("S_PRODUCT.insert", record);
    }

    public void insertSelective(SProduct record) {
        this.getSqlMapClientTemplate().insert("S_PRODUCT.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SProduct> selectByExample(SProductCriteria example) {
        List<SProduct> list = this.getSqlMapClientTemplate().queryForList("S_PRODUCT.selectByExample", example);
        return list;
    }

    public SProduct selectByPrimaryKey(Integer id) {
        SProduct key = new SProduct();
        key.setId(id);
        SProduct record = (SProduct) this.getSqlMapClientTemplate().queryForObject("S_PRODUCT.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SProduct record, SProductCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_PRODUCT.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SProduct record, SProductCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_PRODUCT.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SProduct record) {
        int rows = this.getSqlMapClientTemplate().update("S_PRODUCT.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SProduct record) {
        int rows = this.getSqlMapClientTemplate().update("S_PRODUCT.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SProductCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SProductCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}