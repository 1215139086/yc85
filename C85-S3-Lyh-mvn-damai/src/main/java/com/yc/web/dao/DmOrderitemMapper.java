package com.yc.web.dao;

import java.util.List;

import com.yc.web.bean.DmOrderitem;

public interface DmOrderitemMapper {

	List<DmOrderitem> selectAll();
	
	DmOrderitem selectById(int id);
	
	int insert(DmOrderitem doi);
}