package com.mph.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="gs1")
	@Scope(value="prototype")
	public GreetingServiceImpl getGsi() {
		GreetingServiceImpl gs = new GreetingServiceImpl();
		gs.setGreetMsg("Bye Bye Everyone");
		return gs;
	}
	@Bean(name="gs2")
	public GreetingServiceImpl getCon() {
		GreetingServiceImpl gs = new GreetingServiceImpl("Good u Bye Everyone");
		return gs;
	}
	
}
