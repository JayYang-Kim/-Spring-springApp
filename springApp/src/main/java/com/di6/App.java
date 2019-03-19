package com.di6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML���κ��� ��ü ���� ������ ������ (�������� ����� �������� ����� ����)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di6/applicationContext.xml");
		
		try {
			UserBean user = context.getBean(UserBean.class);
			
			/*
			 * movie�� �� ���� ��ü�� ���������� music�� play() �޼ҵ带 ȣ���Ҷ����� ��ü�� ������
			 * <aop:scoped-proxy/> : �ش� ��ü�� �����Ҷ�����(Ŭ������ �޼ҵ带 ȣ���Ҷ� ����) ���ο� ��ü�� ������
			 */
			user.execute();
			System.out.println("--------------------------------------------------");
			user.execute();
			System.out.println("--------------------------------------------------");
			user.execute();
			System.out.println("--------------------------------------------------");
			user.execute();
			System.out.println("--------------------------------------------------");
		} finally {
			context.close();
		}

	}

}
