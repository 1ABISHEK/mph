package com.mph.view;

import java.util.Scanner;

import com.mph.controller.EmployeeController;

public class MainClass {

	public static void main(String[] args) {
		EmployeeController ec = new EmployeeController();
		Scanner s = new Scanner(System.in);
		
		String ch=null;
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. get Employee id");
			System.out.println("4. Search By email id");
			int choice = s.nextInt();
			switch(choice) {
			case 1:{
				ec.addEmployee();
				break;
			}
			case 2:{
				ec.viewEmployee();
				break;
			}
			case 3:{
				ec.getEmployeeById();
				break;
			}
			case 4:{
				ec.searchByEmailUsingCQ();
				break;
			}
			
			default:
				System.out.println("Enter the right choice...../");
				
			}
			System.out.println("Do u wanna cont? Y|y");
			ch=s.next();
			
		}while(ch.equals("Y")|| ch.equals("y"));

	}

}
