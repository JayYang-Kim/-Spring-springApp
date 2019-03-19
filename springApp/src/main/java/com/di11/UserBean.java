package com.di11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

public class UserBean {
	/*
	 * @Autowired : 스프링 전용 / 타입으로 의존 설정
	 * @Resource : 자바에서 지원 / 이름(id)으로 의존관계 설정
	 * @Inject : 자바에서 지원 / 타입으로 의존관계 설정 (메이븐 추가 필요)
	 */
	@Inject
	private UserService userService; // 프로퍼티명
	
	// 객체가 생성될때 한 번만 호출 (사용자가 지정 가능)
	@PostConstruct // 생성자가 만들어진 뒤 한 번 출력
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("결과 : \n" + s);
	}
	
	@PreDestroy // 종료되기 전 한 번 출력
	public void destroy() {
		System.out.println("destroy");
	}
}
