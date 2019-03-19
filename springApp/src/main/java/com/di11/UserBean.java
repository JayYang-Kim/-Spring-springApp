package com.di11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

public class UserBean {
	/*
	 * @Autowired : ������ ���� / Ÿ������ ���� ����
	 * @Resource : �ڹٿ��� ���� / �̸�(id)���� �������� ����
	 * @Inject : �ڹٿ��� ���� / Ÿ������ �������� ���� (���̺� �߰� �ʿ�)
	 */
	@Inject
	private UserService userService; // ������Ƽ��
	
	// ��ü�� �����ɶ� �� ���� ȣ�� (����ڰ� ���� ����)
	@PostConstruct // �����ڰ� ������� �� �� �� ���
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("��� : \n" + s);
	}
	
	@PreDestroy // ����Ǳ� �� �� �� ���
	public void destroy() {
		System.out.println("destroy");
	}
}
