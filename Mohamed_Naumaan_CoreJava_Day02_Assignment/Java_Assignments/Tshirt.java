package com.sonata;

public class Tshirt {
	
	String color;
	String material;
	String design;
	String size;
	
	Tshirt() {}
	
	Tshirt(String col,String mat,String des,String siz) {
		this.color=col;
		this.material=mat;
		this.design=des;
		this.size=siz;
	}
	
	void display() {
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
		System.out.println(size);
	}

	public static void main(String[] args) {
		Tshirt t1=new Tshirt("White","Cotton","Boy","Small");
		t1.display();
		System.out.println();
		Tshirt t2=new Tshirt("Black","Silk","Girl","Large");
		t2.display();
		System.out.println();
		Tshirt t3=new Tshirt("Red","Linen","Boy","X-Large");
		t3.display();
		System.out.println();
	}

}
