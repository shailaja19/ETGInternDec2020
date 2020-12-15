package com.sonata.Q4;

public class Emp {
     int empid;
     String ename;
     double basicpay;
     int leaves;
     Address obj;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ",  leaves=" + leaves + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	
	public double calculateSalary() {
		
		return basicpay;
	}
	public void display() {
		System.out.println(calculateSalary());
	}
	
}
