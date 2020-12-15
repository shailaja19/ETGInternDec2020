package com.sonata;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s1=new Sedan(100,25000,"White",21);
		System.out.println("The details of Sedan are:");
		s1.display();
		System.out.println();
		Ford f1=new Ford(120,30000,"Black",2019,3000);
		System.out.println("The details of Ford are:");
		f1.display();
		System.out.println();
		Ford f2=new Ford(80,15000,"Blue",2008,500);
		System.out.println("The details of Ford are:");
		f2.display();
		System.out.println();
		Car c1=new Car(130,35000,"Red");
		System.out.println("The details of Car class are:");
		c1.display();

	}

}
