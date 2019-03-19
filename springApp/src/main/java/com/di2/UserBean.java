package com.di2;

public class UserBean {
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// ��ü�� �����ɶ� �� ���� ȣ�� (����ڰ� ���� ����)
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("��� : " + s);
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
