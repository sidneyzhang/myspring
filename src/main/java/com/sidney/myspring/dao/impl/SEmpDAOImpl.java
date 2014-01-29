package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.SEmpDAO;
import com.sidney.myspring.repository.ibatis.SEmp;
import com.sidney.myspring.repository.ibatis.SEmpCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SEmpDAOImpl extends SqlMapClientDaoSupport implements SEmpDAO {

    @Autowired
    public SEmpDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(SEmpCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_EMP.countByExample", example);
        return count;
    }

    public int deleteByExample(SEmpCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_EMP.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        SEmp key = new SEmp();
        key.setId(id);
        int rows = this.getSqlMapClientTemplate().delete("S_EMP.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(SEmp record) {
        this.getSqlMapClientTemplate().insert("S_EMP.insert", record);
    }

    public void insertSelective(SEmp record) {
        this.getSqlMapClientTemplate().insert("S_EMP.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<SEmp> selectByExample(SEmpCriteria example) {
        List<SEmp> list = this.getSqlMapClientTemplate().queryForList("S_EMP.selectByExample", example);
        return list;
    }

    public SEmp selectByPrimaryKey(Integer id) {
        SEmp key = new SEmp();
        key.setId(id);
        SEmp record = (SEmp) this.getSqlMapClientTemplate().queryForObject("S_EMP.selectByPrimaryKey", key);
        return record;
    }

    public int updateByExampleSelective(SEmp record, SEmpCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_EMP.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SEmp record, SEmpCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_EMP.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(SEmp record) {
        int rows = this.getSqlMapClientTemplate().update("S_EMP.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(SEmp record) {
        int rows = this.getSqlMapClientTemplate().update("S_EMP.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends SEmpCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, SEmpCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}