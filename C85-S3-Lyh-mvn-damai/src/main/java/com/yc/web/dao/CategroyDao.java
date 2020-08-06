package com.yc.web.dao;

import java.util.List;

import com.yc.web.util.DBHelper;

public class CategroyDao {
	public List<?> query() {
		return new DBHelper().query("select * from dm_category");
		
	}

}
