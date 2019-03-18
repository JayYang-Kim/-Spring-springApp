package com.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML으로부터 객체 생성 정보를 가져옴 (가져오는 방법은 여러가지 방법이 있음)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di/applicationContext.xml");
		
		try {
			UserBean user = (UserBean)context.getBean("user");
			user.write();
		} finally {
			context.close();
		}

	}

}
