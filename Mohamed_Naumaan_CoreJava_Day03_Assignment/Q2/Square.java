package com.sonata.Q2;

public class Square extends Shape {
	
	private final double length;
	
	public Square() {
		this(1);
	}

	public Square(double l) {
		this.length = l;
	}

	@Override
	public double area() {
		return length * length;
	}
	
	

}
