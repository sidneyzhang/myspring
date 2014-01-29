package com.sidney.myspring.service.impl;

import com.sidney.myspring.dao.SLongtextDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SLongtext;
import com.sidney.myspring.repository.ibatis.SLongtextCriteria;
import com.sidney.myspring.service.SLongtextService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SLongtextServiceImpl implements SLongtextService {
    private static final Logger logger = Logger.getLogger(SLongtextServiceImpl.class);

    private static final String SUCCESS = "成功!";

    private static final String NO_RECORD = "没有找到对应的记录!";

    private static final String EXCEPTION = "系统繁忙!";

    @Autowired
    private SLongtextDAO sLongtextDAO;

    public int countByExample(SLongtextCriteria example) {
        return this.sLongtextDAO.countByExample(example);
    }

    public SLongtext selectByPrimaryKey(Integer id) {
        return this.sLongtextDAO.selectByPrimaryKey(id);
    }

    public List<SLongtext> selectByExample(SLongtextCriteria example) {
        return this.sLongtextDAO.selectByExample(example);
    }

    public Result deleteByPrimaryKey(Integer id) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.deleteByPrimaryKey(id);
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

    public Result updateByPrimaryKeySelective(SLongtext record) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.updateByPrimaryKeySelective(record);
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

    public Result updateByPrimaryKey(SLongtext record) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.updateByPrimaryKey(record);
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

    public Result deleteByExample(SLongtextCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.deleteByExample(example);
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

    public Result updateByExampleSelective(SLongtext record, SLongtextCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.updateByExampleSelective(record, example);
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

    public Result updateByExample(SLongtext record, SLongtextCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sLongtextDAO.updateByExample(record, example);
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

    public Result insert(SLongtext record) {
        Result result = new Result();
        try {
            this.sLongtextDAO.insert(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insertSelective(SLongtext record) {
        Result result = new Result();
        try {
            this.sLongtextDAO.insertSelective(record);
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