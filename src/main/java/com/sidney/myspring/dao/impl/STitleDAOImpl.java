package com.sidney.myspring.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.sidney.myspring.dao.STitleDAO;
import com.sidney.myspring.repository.ibatis.STitle;
import com.sidney.myspring.repository.ibatis.STitleCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class STitleDAOImpl extends SqlMapClientDaoSupport implements STitleDAO {

    @Autowired
    public STitleDAOImpl(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }

    public int countByExample(STitleCriteria example) {
        Integer count = (Integer)  this.getSqlMapClientTemplate().queryForObject("S_TITLE.countByExample", example);
        return count;
    }

    public int deleteByExample(STitleCriteria example) {
        int rows = this.getSqlMapClientTemplate().delete("S_TITLE.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String title) {
        STitle key = new STitle();
        key.setTitle(title);
        int rows = this.getSqlMapClientTemplate().delete("S_TITLE.deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(STitle record) {
        this.getSqlMapClientTemplate().insert("S_TITLE.insert", record);
    }

    public void insertSelective(STitle record) {
        this.getSqlMapClientTemplate().insert("S_TITLE.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<STitle> selectByExample(STitleCriteria example) {
        List<STitle> list = this.getSqlMapClientTemplate().queryForList("S_TITLE.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(STitle record, STitleCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_TITLE.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(STitle record, STitleCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("S_TITLE.updateByExample", parms);
        return rows;
    }

    protected static class UpdateByExampleParms extends STitleCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, STitleCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}