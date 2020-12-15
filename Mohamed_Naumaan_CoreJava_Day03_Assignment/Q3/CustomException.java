package com.sonata.Q3;

public class CustomException {

	public static void main(String[] args) throws OwnException
	{
		int AnnualSalary = 90000;
		if (AnnualSalary<100000)
			throw new OwnException("Employee Annual Salary is less than 1 Lakh");
		else
			System.out.println("Employee Annual salary Above 1 Lakh");
	}

}
