package com.di14;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di14/applicationContext.xml");
		
		try {
			//UserBean user = (UserBean)context.getBean("¾ÆÀÌµð");
			UserBean user = context.getBean(UserBean.class);
			user.write();
		} finally {
			context.close();
		}
	}

}
