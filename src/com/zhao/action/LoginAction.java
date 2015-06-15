package com.zhao.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.zhao.model.User;
import com.zhao.service.LoginService;
@Controller
@Scope("prototype")
public class LoginAction implements Action{
	private String username;
	private String password;
	private List<User> userList = new ArrayList<User>();
	@Resource
	private LoginService loginService;
	@Override
	public String execute() throws Exception {
		User us = new User();
		us.setUsername(username);
		us.setPassword(password);
		System.out.println(loginService.login(us));
		//
		for(int i=0; i<10; i++){
			User user = new User();
			user.setUsername("username" + i);
			user.setPassword("password" + i);
			userList.add(user);
		}
		for(User u : userList){
			System.out.println(u);
		}
		//
		return SUCCESS;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	

}
