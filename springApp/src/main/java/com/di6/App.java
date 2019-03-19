package com.di6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML으로부터 객체 생성 정보를 가져옴 (가져오는 방법은 여러가지 방법이 있음)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di6/applicationContext.xml");
		
		try {
			UserBean user = context.getBean(UserBean.class);
			
			/*
			 * movie는 한 번만 객체가 생성되지만 music은 play() 메소드를 호출할때마다 객체가 생성됨
			 * <aop:scoped-proxy/> : 해당 객체에 접근할때마다(클래스의 메소드를 호출할때 마다) 새로운 객체가 생성됨
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
