package com.sidney.myspring.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidney.myspring.dao.SInventoryDAO;
import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SInventory;
import com.sidney.myspring.repository.ibatis.SInventoryCriteria;
import com.sidney.myspring.repository.ibatis.SInventoryKey;
import com.sidney.myspring.service.SInventoryService;

@Service
public class SInventoryServiceImpl implements SInventoryService {
	private static final Logger logger = Logger
			.getLogger(SInventoryServiceImpl.class);

	private static final String SUCCESS = "成功!";

	private static final String NO_RECORD = "没有找到对应的记录!";

	private static final String EXCEPTION = "系统繁忙!";

	@Autowired
	private SInventoryDAO sInventoryDAO;

	public int countByExample(SInventoryCriteria example) {
		return this.sInventoryDAO.countByExample(example);
	}

	public SInventory selectByPrimaryKey(SInventoryKey key) {
		return this.sInventoryDAO.selectByPrimaryKey(productId, warehouseId);
	}

	public List<SInventory> selectByExample(SInventoryCriteria example) {
		return this.sInventoryDAO.selectByExample(example);
	}

	public Result deleteByPrimaryKey(SInventoryKey key) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.deleteByPrimaryKey(productId,
					warehouseId);
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

	public Result updateByPrimaryKeySelective(SInventory record) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.updateByPrimaryKeySelective(record);
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

	public Result updateByPrimaryKey(SInventory record) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.updateByPrimaryKey(record);
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

	public Result deleteByExample(SInventoryCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.deleteByExample(example);
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

	public Result updateByExampleSelective(SInventory record,
			SInventoryCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.updateByExampleSelective(record,
					example);
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

	public Result updateByExample(SInventory record, SInventoryCriteria example) {
		Result result = new Result();
		try {
			int rows = this.sInventoryDAO.updateByExample(record, example);
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

	public Result insert(SInventory record) {
		Result result = new Result();
		try {
			this.sInventoryDAO.insert(record);
			result.setSuccess(true);
			result.setMessage(SUCCESS);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(EXCEPTION);
			logger.error("Exception e= " + e);
		}
		return result;
	}

	public Result insertSelective(SInventory record) {
		Result result = new Result();
		try {
			this.sInventoryDAO.insertSelective(record);
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