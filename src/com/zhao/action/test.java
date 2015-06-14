package com.zhao.action;

import java.util.ArrayList;
import java.util.List;

import com.zhao.model.User;

public class test {

	public static void main(String[] args) {
		
//		List<User> userList = new ArrayList<User>();
//		for(int i=0; i<3; i++){
//			User user = new User();
//			user.setUsername("username" + i);
//			user.setPassword("password" + i);
//			userList.add(user);
//		}
//		for(User u : userList){
//			System.out.println(u);
//		}
		//not use generics
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		//Generic<User> gu = new Generic<>(user);
		String a = "aaa";
		Generic<String> gu = new Generic<String>(a);
		gu.print();
		

	}
	static class Generic<T>{
		T x;
		public Generic(T x){
			this.x = x;
		}
		public T getX() {
			return x;
		}
		public void setX(T x) {
			this.x = x;
		}
		public void print(){
			System.out.println(x);
		}
		
	}

}
