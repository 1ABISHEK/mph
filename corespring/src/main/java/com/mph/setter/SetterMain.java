package com.mph.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("carssetter.xml");
//		Car c= (Car) context.getBean("car");
//		System.out.println(c.getModel());
//		System.out.println(c.getName());
		User u = (User) context.getBean("user");
//		System.out.println(u.getUserName());
//		System.out.println(u.getCar());
		
		System.out.println(u.getUserName()+" has a "+u.getCar().getName()+" "+u.getCar().getModel());
	}

}
