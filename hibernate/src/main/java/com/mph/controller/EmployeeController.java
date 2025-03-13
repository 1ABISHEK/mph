package com.mph.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.mph.entity.Address;
import com.mph.entity.Department;
import com.mph.entity.Employee;

public class EmployeeController {

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction tsn;
	Employee emp;
	Department dep;
	Address add;
	Scanner s = new Scanner(System.in);

	public void addEmployee() {
		tsn = session.beginTransaction();
		emp = new Employee();
		dep = new Department();
		add = new Address();
		System.out.println("Enter your ID:");
		int id = s.nextInt();
		emp.setId(id);

		System.out.println("Enter yout Name:");
		String name = s.next();
		emp.setName(name);

		System.out.println("Enter yout Email:");
		String email = s.next();
		emp.setEmail(email);

		System.out.println("Enter yout pass:");
		String password = s.next();
		emp.setPassword(password);

		System.out.println("Enter yout Gender:");
		String gender = s.next();
		emp.setGender(gender);

		System.out.println("Enter your ID:");
		int did = s.nextInt();
		dep.setDid(did);

		System.out.println("Enter yout Name:");
		String dname = s.next();
		dep.setDname(dname);
		
		System.out.println("Enter your AddId");
		int eid = s.nextInt();
		add.setAddrId(eid);
		
		System.out.println("Enter your DoorNo");
		int doorno = s.nextInt();
		add.setDoorNo(doorno);
		
		System.out.println("Enter your Street");
		String street = s.next();
		add.setStreet(street);
		
		System.out.println("Enter your City");
		String city = s.next();
		add.setCity(city);
		
		System.out.println("Enter your ZipCode");
		int zip = s.nextInt();
		add.setZipcode(zip);
		
		List<Address> addrList = new ArrayList<Address>();
		add.setEmployee(emp);
		addrList.add(add);

		
		emp.setAddress(addrList);
		session.save(add);
		session.save(dep);
		emp.setDid(dep);
		session.save(emp);
		tsn.commit();
		System.out.println("Data Inserted Succesfully in the DB");

	}
	public void viewEmployee() {
		session.clear();
		Query qry = session.createQuery("from Employee");
		List<Employee> emplist =qry.list();
		Iterator i = emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void getEmployeeById() {
		System.out.println("Enter your Emp ID:");
		int emid = s.nextInt();
		Query qry = session.createNamedQuery("GET_EMP_BY_ID")
				.setInteger("id", emid);
		Employee emp = (Employee) qry.uniqueResult();
		System.out.println(emp);
	}
	
	public void searchByEmailUsingCQ() {
		System.out.println("Enter your Email:");
		String emailid = s.next();		
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("email", emailid));		
		Employee emp = (Employee) c.uniqueResult();
		System.out.println(emp);
	}


}
