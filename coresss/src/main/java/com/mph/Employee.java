package com.mph;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("Abishek")
	private String ename;

	@Value("101")
	private int eid;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}

}
