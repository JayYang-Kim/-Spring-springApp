package com.di10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML���κ��� ��ü ���� ������ ������ (�������� ����� �������� ����� ����)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di10/applicationContext.xml");
		
		try {
			// ��ü�� �������� ���
			//UserBean user = (UserBean)context.getBean("user"); // applicationContext.xml���� ������ ��ü�� ������
			UserBean user = context.getBean(UserBean.class);
			user.write();
		} finally {
			context.close();
		}

	}

}
