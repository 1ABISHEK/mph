package com.mph.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXml {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("greet.xml");
		GreetingService gs = (GreetingServiceImpl) context.getBean("ges");
		gs.sayHi();
	}

}
