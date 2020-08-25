package com.yc.C85S3LyhSpringBoot.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C85S3LyhSpringBoot.dao.UserDao;

import damai.bean.DmUser;

@Service
public class UserBiz {
	
	@Resource
	private UserDao udao;
	
	public DmUser login(String name,String pwd) throws BizException{
		DmUser user=udao.selectByLogin(name,pwd);
		
		if(user == null) {
			throw new BizException("用户名或密码错误！");
		}
		return user;
	}
}
