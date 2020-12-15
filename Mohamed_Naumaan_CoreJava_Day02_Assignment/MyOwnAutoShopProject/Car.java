package com.sonata;

public class Car {
	
	int speed;
	double regularPrice;
	String color;
	
	Car() {}
	
	double getSalePrice() {
		return regularPrice;
	}
	
	Car(int s,double price,String col) {
		this.speed=s;
		this.regularPrice=price;
		this.color=col;
	}
	
	void display() {
		System.out.println("The speed of car is  " + speed);
		System.out.println("The price is  " + getSalePrice());
		System.out.println("The Color is  " + color);
		
	}

}
