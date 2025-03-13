package com.mph.lc.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollege {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("collegeanno.xml");
		College c = (College) context.getBean("college");
		System.out.println(c.getId());
		context.registerShutdownHook();
	}

}
