package com.sidney.myspring.service.impl;

import com.sidney.myspring.dao.SEmpDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SEmp;
import com.sidney.myspring.repository.ibatis.SEmpCriteria;
import com.sidney.myspring.service.SEmpService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEmpServiceImpl implements SEmpService {
    private static final Logger logger = Logger.getLogger(SEmpServiceImpl.class);

    private static final String SUCCESS = "成功!";

    private static final String NO_RECORD = "没有找到对应的记录!";

    private static final String EXCEPTION = "系统繁忙!";

    @Autowired
    private SEmpDAO sEmpDAO;

    public int countByExample(SEmpCriteria example) {
        return this.sEmpDAO.countByExample(example);
    }

    public SEmp selectByPrimaryKey(Integer id) {
        return this.sEmpDAO.selectByPrimaryKey(id);
    }

    public List<SEmp> selectByExample(SEmpCriteria example) {
        return this.sEmpDAO.selectByExample(example);
    }

    public Result deleteByPrimaryKey(Integer id) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.deleteByPrimaryKey(id);
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

    public Result updateByPrimaryKeySelective(SEmp record) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.updateByPrimaryKeySelective(record);
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

    public Result updateByPrimaryKey(SEmp record) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.updateByPrimaryKey(record);
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

    public Result deleteByExample(SEmpCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.deleteByExample(example);
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

    public Result updateByExampleSelective(SEmp record, SEmpCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.updateByExampleSelective(record, example);
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

    public Result updateByExample(SEmp record, SEmpCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sEmpDAO.updateByExample(record, example);
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

    public Result insert(SEmp record) {
        Result result = new Result();
        try {
            this.sEmpDAO.insert(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insertSelective(SEmp record) {
        Result result = new Result();
        try {
            this.sEmpDAO.insertSelective(record);
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