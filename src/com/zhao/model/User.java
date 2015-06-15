package com.zhao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {
	private String username;
	private String password;
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
	
	public String toString(){
		return "username:" + this.username + ", " + "password:" + password;
	}
}
