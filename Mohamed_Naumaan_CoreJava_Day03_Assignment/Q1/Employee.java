package com.sonata.Q3;

public class Employee implements EmpInterface{
		 int empid;
		 String ename;
		 double sal;
		Employee(){}
		Employee(int a , String b,double c){
			this.empid=a;
			this.ename=b;
			this.sal=c;
		}
		 
		@Override
			 public double salCal()
			 {
			    return sal;
			 }
		
		 public void display() {
			System.out.println(empid);
			System.out.println(ename);
			System.out.println(salCal());
			
		}
		
		}

