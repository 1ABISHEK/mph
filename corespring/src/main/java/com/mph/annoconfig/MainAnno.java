package com.mph.annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnno {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annogreet.xml");
		GreetService gs = (GreetServiceImpl) context.getBean("greetServiceImpl");
		gs.sayHi();

	}

}
