package com.mph.lc.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassDB {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DB.xml");
		DBConn db = (DBConn) context.getBean("Db");
		System.out.println(db.getUrl());
		System.out.println(db.getUname());
		System.out.println(db.getPass());
	}

}
