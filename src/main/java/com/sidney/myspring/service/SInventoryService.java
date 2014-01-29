package com.sidney.myspring.service;

import java.util.List;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SInventory;
import com.sidney.myspring.repository.ibatis.SInventoryCriteria;
import com.sidney.myspring.repository.ibatis.SInventoryKey;

public interface SInventoryService {
	int countByExample(SInventoryCriteria example);

	SInventory selectByPrimaryKey(SInventoryKey key);

	List<SInventory> selectByExample(SInventoryCriteria example);

	Result deleteByPrimaryKey(SInventoryKey key);

	Result updateByPrimaryKeySelective(SInventory record);

	Result updateByPrimaryKey(SInventory record);

	Result deleteByExample(SInventoryCriteria example);

	Result updateByExampleSelective(SInventory record,
			SInventoryCriteria example);

	Result updateByExample(SInventory record, SInventoryCriteria example);

	Result insert(SInventory record);

	Result insertSelective(SInventory record);
}