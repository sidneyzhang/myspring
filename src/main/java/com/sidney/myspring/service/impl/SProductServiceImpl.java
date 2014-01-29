package com.sidney.myspring.service.impl;

import com.sidney.myspring.dao.SProductDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SProduct;
import com.sidney.myspring.repository.ibatis.SProductCriteria;
import com.sidney.myspring.service.SProductService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProductServiceImpl implements SProductService {
    private static final Logger logger = Logger.getLogger(SProductServiceImpl.class);

    private static final String SUCCESS = "成功!";

    private static final String NO_RECORD = "没有找到对应的记录!";

    private static final String EXCEPTION = "系统繁忙!";

    @Autowired
    private SProductDAO sProductDAO;

    public int countByExample(SProductCriteria example) {
        return this.sProductDAO.countByExample(example);
    }

    public SProduct selectByPrimaryKey(Integer id) {
        return this.sProductDAO.selectByPrimaryKey(id);
    }

    public List<SProduct> selectByExample(SProductCriteria example) {
        return this.sProductDAO.selectByExample(example);
    }

    public Result deleteByPrimaryKey(Integer id) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.deleteByPrimaryKey(id);
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

    public Result updateByPrimaryKeySelective(SProduct record) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.updateByPrimaryKeySelective(record);
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

    public Result updateByPrimaryKey(SProduct record) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.updateByPrimaryKey(record);
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

    public Result deleteByExample(SProductCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.deleteByExample(example);
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

    public Result updateByExampleSelective(SProduct record, SProductCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.updateByExampleSelective(record, example);
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

    public Result updateByExample(SProduct record, SProductCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sProductDAO.updateByExample(record, example);
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

    public Result insert(SProduct record) {
        Result result = new Result();
        try {
            this.sProductDAO.insert(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insertSelective(SProduct record) {
        Result result = new Result();
        try {
            this.sProductDAO.insertSelective(record);
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