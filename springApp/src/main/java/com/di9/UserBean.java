package com.di9;

import org.springframework.beans.factory.annotation.Autowired;

public class UserBean {
	/*
	 * @Autowired : type에 의한 의존관계 자동 설정
	 * setter가 필요하지 않다. (동일한 type의 객체가 2개 이상이면 예외발생) 
	 * (단, 동일한 type 객체가 2개 이상이더라도, 객체 id와 property명이 동일한 경우 동일한 이름의 property로 설정) 
	 */
	@Autowired
	private UserService userService; // 프로퍼티명
	
	// 객체가 생성될때 한 번만 호출 (사용자가 지정 가능)
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
