package com.di15;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		name = "¿­°ø";
		tel = "010";
		age = 20;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String message() {
		String s = null;
		
		s = name + " : " + tel + " : " + age;
		
		return s;
	}
	
}
