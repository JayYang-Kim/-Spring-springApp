package com.di10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML으로부터 객체 생성 정보를 가져옴 (가져오는 방법은 여러가지 방법이 있음)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di10/applicationContext.xml");
		
		try {
			// 객체를 가져오는 방법
			//UserBean user = (UserBean)context.getBean("user"); // applicationContext.xml에서 생성된 객체를 가져옴
			UserBean user = context.getBean(UserBean.class);
			user.write();
		} finally {
			context.close();
		}

	}

}
