package com.di12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 기본적으로 id는 클래스 이름 중 첫글자가 소문자인 클래스명이다. (userBean)
// id를 지정 가능 / @Component("아이디")
@Component("di12.userBean")
public class UserBean {
	@Autowired
	private UserService userService; // 프로퍼티명
	
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("결과 : \n" + s);
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
