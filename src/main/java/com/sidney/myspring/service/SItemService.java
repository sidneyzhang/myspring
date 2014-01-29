package com.sidney.myspring.service;

import java.util.List;

import com.sidney.myspring.repository.ibatis.Result;
import com.sidney.myspring.repository.ibatis.SItem;
import com.sidney.myspring.repository.ibatis.SItemCriteria;
import com.sidney.myspring.repository.ibatis.SItemKey;

public interface SItemService {
	int countByExample(SItemCriteria example);

	SItem selectByPrimaryKey(SItemKey key);

	List<SItem> selectByExample(SItemCriteria example);

	Result deleteByPrimaryKey(SItemKey key);

	Result updateByPrimaryKeySelective(SItem record);

	Result updateByPrimaryKey(SItem record);

	Result deleteByExample(SItemCriteria example);

	Result updateByExampleSelective(SItem record, SItemCriteria example);

	Result updateByExample(SItem record, SItemCriteria example);

	Result insert(SItem record);

	Result insertSelective(SItem record);
}