package com.di5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML으로부터 객체 생성 정보를 가져옴 (가져오는 방법은 여러가지 방법이 있음)
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/di5/applicationContext.xml");
		
		try {
			Movie movie1 = context.getBean(Movie.class);
			Movie movie2 = context.getBean(Movie.class);
			
			Music music1 = context.getBean(Music.class);
			Music music2 = context.getBean(Music.class);
			
			// singleton(기본)
			System.out.println(movie1 == movie2); // [결과] true
			System.out.println(movie1);
			System.out.println(movie2);
			
			// prototype
			System.out.println(music1 == music2); // [결과] false
			System.out.println(music1);
			System.out.println(music2);
		} finally {
			context.close();
		}

	}

}
