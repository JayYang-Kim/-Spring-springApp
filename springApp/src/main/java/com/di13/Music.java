package com.di13;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS) // �⺻ : singleton
public class Music {
	public void play() {
		System.out.println("���� : " + toString());
	}
}
