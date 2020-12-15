package com.sonata.Q4;

public class TechEmp  extends Emp  implements EmpTechInterface {

	@Override
	public double calculateSalary() {
		double HRA=  basicpay*0.12;
		return basicpay-HRA;
	}
	public static void main(String[] args) {
		TechEmp t1=new TechEmp();
		Address a1= new Address();
		
		 a1.setDoorno(19);
		 a1.setCity("banglore");
		 a1.setPin(560062);
		 a1.setStreet("chunchaghatta");
		 System.out.println(a1);
		 t1.setEmpid(1);
		 t1.setEname("megs");
		 t1.setLeaves(10);
		 t1.setBasicpay(25000);
		 System.out.println(t1);
		 System.out.println("The salary of Techincal Empolyee");
		 t1.display();
		 }
	}
