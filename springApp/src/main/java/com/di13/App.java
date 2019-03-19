package com.di13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML���κ��� ��ü ���� ������ ������ (�������� ����� �������� ����� ����)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di13/applicationContext.xml");
		
		try {
			UserBean user = context.getBean(UserBean.class);
			
			// music�� proxyMode�� ����  music �޼ҵ带 ȣ���Ҷ� ���� ��ü�� ������ 
			
			System.out.println("--------------------------------------------------");
			user.execute();
			System.out.println("--------------------------------------------------");
			user.execute();
			System.out.println("--------------------------------------------------");
			user.execute();
		} finally {
			context.close();
		}

	}

}
