package com.sonata.Q3;

public class Manager extends Employee implements EmpInterface {
	Manager(int a , String b,double c){
		super(a,b,c);
	}
    @Override  
	 public double salCal()
	 {
	    System.out.println("Salary of manager is ");
	    return sal;
	 }
	public static void main(String[] args) {
		
      Manager m1= new Manager(01,"megs",5000);
      m1.display();
	}

}
