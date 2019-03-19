package com.di10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {
	/*
	 * @Qualifier
	 * @Autowired���� ������ type�� ��ü�� 2�� �̻��� ��� Ư���� ��ü(id�� ����)�� �������踦 ������ ��� ���
	 * @Autowired�� �Բ� ����ؾ��� 
	 * 
	 * @Resource
	 * �������踦 �̸�(id)�� �̿��Ͽ� ����
	 * @Autowired + @Qualifier�� ������ ����
	 * 
	 * @Resource(name="userService2")
	 */
	@Autowired
	@Qualifier("userService2")
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
