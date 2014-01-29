package com.sidney.myspring.service.impl;

import com.sidney.myspring.dao.SOrdDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SOrd;
import com.sidney.myspring.repository.ibatis.SOrdCriteria;
import com.sidney.myspring.service.SOrdService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOrdServiceImpl implements SOrdService {
    private static final Logger logger = Logger.getLogger(SOrdServiceImpl.class);

    private static final String SUCCESS = "成功!";

    private static final String NO_RECORD = "没有找到对应的记录!";

    private static final String EXCEPTION = "系统繁忙!";

    @Autowired
    private SOrdDAO sOrdDAO;

    public int countByExample(SOrdCriteria example) {
        return this.sOrdDAO.countByExample(example);
    }

    public SOrd selectByPrimaryKey(Integer id) {
        return this.sOrdDAO.selectByPrimaryKey(id);
    }

    public List<SOrd> selectByExample(SOrdCriteria example) {
        return this.sOrdDAO.selectByExample(example);
    }

    public Result deleteByPrimaryKey(Integer id) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.deleteByPrimaryKey(id);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result updateByPrimaryKeySelective(SOrd record) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.updateByPrimaryKeySelective(record);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result updateByPrimaryKey(SOrd record) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.updateByPrimaryKey(record);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result deleteByExample(SOrdCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.deleteByExample(example);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result updateByExampleSelective(SOrd record, SOrdCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.updateByExampleSelective(record, example);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result updateByExample(SOrd record, SOrdCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sOrdDAO.updateByExample(record, example);
            if (rows > 0) {
                result.setSuccess(true);
                result.setMessage(SUCCESS);
            } else {
                result.setSuccess(false);
                result.setMessage(NO_RECORD);
                logger.warn(NO_RECORD);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insert(SOrd record) {
        Result result = new Result();
        try {
            this.sOrdDAO.insert(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insertSelective(SOrd record) {
        Result result = new Result();
        try {
            this.sOrdDAO.insertSelective(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }
}