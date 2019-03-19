package com.di15;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		//AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di14/applicationContext.xml");
		// AnnotationConfigApplicationContext : �ڹٸ� �̿��� ȯ�漳�� Ŭ����
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		try {
			//UserBean user = (UserBean)context.getBean("���̵�");
			UserBean user = context.getBean(UserBean.class);
			user.write();
		} finally {
			context.close();
		}
	}

}
