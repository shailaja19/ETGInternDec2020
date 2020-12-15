package com.sonata.Q2;

public class TestShape {
	public static void main(String[] args) {
		
		//Rectangle
		double width=5, length=7;
		Shape rect = new Rectangle(width,length);
		System.out.println("Area of Rectangle : " + rect.area());
		
		//Square
		double length1=8;
		Shape squr = new Square(length1);
		System.out.println("Area of Square : " + squr.area());
		
		//Triangle
		double a=5, b=3, c=4 ;
		Shape tri = new Triangle(a,b,c);
		System.out.println("Area of Triangle : " + tri.area());
	}

}
