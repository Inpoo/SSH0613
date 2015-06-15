package com.zhao.service.impl;


import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zhao.dao.BaseDao;
import com.zhao.model.User;
import com.zhao.service.LoginService;
@Component("loginService")
public class LoginServiceImpl implements LoginService{
	@Resource
	private BaseDao<User> baseDao;
	@Override
	public User login(User user) {
		System.out.println("login");
		List<Object> param=new LinkedList<Object>();
		StringBuffer hql=new StringBuffer("from User u where u.userame=? and u.password=?");
		param.add(user.getUsername());
		param.add(user.getPassword());
		return baseDao.get(hql.toString(), param);
		
	}
	
}
