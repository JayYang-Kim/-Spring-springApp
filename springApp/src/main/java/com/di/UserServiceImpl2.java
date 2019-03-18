package com.di;

public class UserServiceImpl2 implements UserService {
	
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		name = "½ºÇÁ¸µ";
		tel = "010";
		age = 20;
	}
	
	@Override
	public String message() {
		String s = name + " < " + tel + " < " + age;
		return s;
	}
	
}
