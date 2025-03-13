package com.mph.lc.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSchool {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("school.xml");
		School sc = (School) context.getBean("sch");
		System.out.println(sc.getId());
		context.registerShutdownHook();

	}

}
