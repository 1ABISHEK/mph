package com.mph.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJava {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingServices gs1 = (GreetingServiceImpl) context.getBean("gs1");
		gs1.sayHi();
		System.out.println(gs1.hashCode());
		GreetingServices gs12 = (GreetingServiceImpl) context.getBean("gs1");
		gs12.sayHi();
		System.out.println(gs12.hashCode());
		GreetingServices gs2 = (GreetingServiceImpl) context.getBean("gs2");
		gs2.sayHi();

	}

}
