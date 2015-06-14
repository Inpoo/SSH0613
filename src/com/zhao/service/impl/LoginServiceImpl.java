package com.zhao.service.impl;


import org.springframework.stereotype.Component;

import com.zhao.model.User;
import com.zhao.service.LoginService;
@Component("loginService")
public class LoginServiceImpl implements LoginService{

	@Override
	public void login(User user) {
		System.out.println();
		
	}
	
}
