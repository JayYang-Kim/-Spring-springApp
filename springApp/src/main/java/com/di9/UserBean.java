package com.di9;

import org.springframework.beans.factory.annotation.Autowired;

public class UserBean {
	/*
	 * @Autowired : type�� ���� �������� �ڵ� ����
	 * setter�� �ʿ����� �ʴ�. (������ type�� ��ü�� 2�� �̻��̸� ���ܹ߻�) 
	 * (��, ������ type ��ü�� 2�� �̻��̴���, ��ü id�� property���� ������ ��� ������ �̸��� property�� ����) 
	 */
	@Autowired
	private UserService userService; // ������Ƽ��
	
	// ��ü�� �����ɶ� �� ���� ȣ�� (����ڰ� ���� ����)
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
