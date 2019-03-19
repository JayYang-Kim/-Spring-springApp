package com.di14;

import org.springframework.beans.factory.annotation.Autowired;

public class UserBean {
	@Autowired
	private UserService userService; // ������Ƽ��
	
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("��� : \n" + s);
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
