package com.sonata.Q3;

public class Tester extends Employee {
	Tester(int a , String b,double c){
		super(a,b,c);
	}
	  @Override   
	 public double salCal()
	 {
	    System.out.println("Salary of Tester is ");
	    return sal;
	 }
	public static void main(String[] args) {
		
      Tester m1= new Tester(01,"megs",4000);
      m1.display();
	}

}
