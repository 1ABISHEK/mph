package com.mph;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;

public class Salary {
	@Value("30000")
	private int salary;

	private Date date;

	@Value("2025-03-12")
	public void datestrr(String datestr) {
		this.date = Date.valueOf(datestr);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setData(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + ", date=" + date + "]";
	}

}
