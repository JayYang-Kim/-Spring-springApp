package com.di14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean(name="di14.userService")
	public UserService userServiceDevice() {
		return new UserServiceImpl();
	}
	
	@Bean(name="di14.userBean", initMethod="init", destroyMethod="destroy")
	public UserBean userDevice() {
		return new UserBean();
	}
}
