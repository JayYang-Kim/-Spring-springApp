package com.di13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML으로부터 객체 생성 정보를 가져옴 (가져오는 방법은 여러가지 방법이 있음)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di13/applicationContext.xml");
		
		try {
			UserBean user = context.getBean(UserBean.class);
			
			// music은 proxyMode에 의해  music 메소드를 호출할때 마다 객체가 생성됨 
			
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
