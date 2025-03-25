package com.mph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee e = (Employee) context.getBean("employee");
		Salary s = (Salary) context.getBean("sal");
		System.out.println(
				e.getEname() + " with Id " + e.getEid() + " is earning Salary " + s.getSalary() + " on " + s.getDate());
	}

}
