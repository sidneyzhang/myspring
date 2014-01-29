package com.sidney.myspring.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidney.myspring.dao.SItemDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SItem;
import com.sidney.myspring.repository.ibatis.SItemCriteria;
import com.sidney.myspring.repository.ibatis.SItemKey;
import com.sidney.myspring.service.SItemService;

@Service
public class SItemServiceImpl implements SItemService {
	private static final Logger logger = Logger
			.getLogger(SItemServiceImpl.class);

	private static final String SUCCESS = "成功!";

	private static final String NO_RECORD = "没有找到对应的记录!";

	private static final String EXCEPTION = "系统繁忙!";

	@Autowired
	private SItemDAO sItemDAO;

	public int countByExample(SItemCriteria example) {
		return this.sItemDAO.countByExample(example);
	}

	public SItem selectByPrimaryKey(SItemKey key) {
		return this.sItemDAO.selectByPrimaryKey(key);
	}

	public List<SItem> selectByExample(SItemCriteria example) {
		return this.sItemDAO.selectByExample(example);
	}

	public Result deleteByPrimaryKey(SItemKey key) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.deleteByPrimaryKey(key);
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

	public Result updateByPrimaryKeySelective(SItem record) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.updateByPrimaryKeySelective(record);
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

	public Result updateByPrimaryKey(SItem record) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.updateByPrimaryKey(record);
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

	public Result deleteByExample(SItemCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.deleteByExample(example);
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

	public Result updateByExampleSelective(SItem record, SItemCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.updateByExampleSelective(record, example);
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

	public Result updateByExample(SItem record, SItemCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sItemDAO.updateByExample(record, example);
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

	public Result insert(SItem record) {
		Result result = new Result();
		try {
			this.sItemDAO.insert(record);
			result.setSuccess(true);
			result.setMessage(SUCCESS);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(EXCEPTION);
			logger.error("Exception e= " + e);
		}
		return result;
	}

	public Result insertSelective(SItem record) {
		Result result = new Result();
		try {
			this.sItemDAO.insertSelective(record);
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