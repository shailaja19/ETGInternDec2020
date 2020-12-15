package com.sonata.Q3;

public class Developer extends Employee {
	Developer(int a , String b,double c){
		super(a,b,c);
	}
	  @Override  
	 public double salCal()
	 {
	    System.out.println("Salary of Developer is ");
	    return sal;
	 }
	public static void main(String[] args) {
		
      Developer m1= new Developer(01,"megs",2000);
      m1.display();
	}

}

