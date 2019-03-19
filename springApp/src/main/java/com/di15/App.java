package com.di15;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		//AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di14/applicationContext.xml");
		// AnnotationConfigApplicationContext : 자바를 이용한 환경설정 클래스
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		try {
			//UserBean user = (UserBean)context.getBean("아이디");
			UserBean user = context.getBean(UserBean.class);
			user.write();
		} finally {
			context.close();
		}
	}

}
