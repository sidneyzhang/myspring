package com.sidney.myspring.service.impl;

import com.sidney.myspring.dao.SRegionDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SRegion;
import com.sidney.myspring.repository.ibatis.SRegionCriteria;
import com.sidney.myspring.service.SRegionService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SRegionServiceImpl implements SRegionService {
    private static final Logger logger = Logger.getLogger(SRegionServiceImpl.class);

    private static final String SUCCESS = "成功!";

    private static final String NO_RECORD = "没有找到对应的记录!";

    private static final String EXCEPTION = "系统繁忙!";

    @Autowired
    private SRegionDAO sRegionDAO;

    public int countByExample(SRegionCriteria example) {
        return this.sRegionDAO.countByExample(example);
    }

    public SRegion selectByPrimaryKey(Integer id) {
        return this.sRegionDAO.selectByPrimaryKey(id);
    }

    public List<SRegion> selectByExample(SRegionCriteria example) {
        return this.sRegionDAO.selectByExample(example);
    }

    public Result deleteByPrimaryKey(Integer id) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.deleteByPrimaryKey(id);
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

    public Result updateByPrimaryKeySelective(SRegion record) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.updateByPrimaryKeySelective(record);
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

    public Result updateByPrimaryKey(SRegion record) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.updateByPrimaryKey(record);
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

    public Result deleteByExample(SRegionCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.deleteByExample(example);
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

    public Result updateByExampleSelective(SRegion record, SRegionCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.updateByExampleSelective(record, example);
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

    public Result updateByExample(SRegion record, SRegionCriteria example) {
        Result result = new Result();
        try {
            int rows = this.sRegionDAO.updateByExample(record, example);
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

    public Result insert(SRegion record) {
        Result result = new Result();
        try {
            this.sRegionDAO.insert(record);
            result.setSuccess(true);
            result.setMessage(SUCCESS);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(EXCEPTION);
            logger.error("Exception e= " + e);
        }
        return result;
    }

    public Result insertSelective(SRegion record) {
        Result result = new Result();
        try {
            this.sRegionDAO.insertSelective(record);
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