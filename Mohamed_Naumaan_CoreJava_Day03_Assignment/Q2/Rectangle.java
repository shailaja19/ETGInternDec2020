package com.sonata.Q2;

public class Rectangle extends Shape {
	
	private final double width, length;
	
	public Rectangle() {
		this(1,1);
	}

	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}

	@Override
	public double area() {
		return width * length;
	}
	
	

}
