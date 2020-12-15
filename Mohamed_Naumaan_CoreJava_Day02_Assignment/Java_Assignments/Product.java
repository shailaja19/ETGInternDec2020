package com.sonata;

public class Product {
	
	int proId;
	String proName;
	double proPrice;
	
	Product() {}
	Product(int id,String name,int price) {
		this.proId=id;
		this.proName=name;
		this.proPrice=price;
	}

	public static void main(String[] args) {
		Product p1=new Product(10,"Phone",10000);
		p1.display();
		Product p2=new Product(20,"Tv",20000);
		p2.display();
	}
	
	void display() {
		System.out.println(proId);
		System.out.println(proName);
		System.out.println(proPrice=(proPrice+(proPrice*0.18)));
	}

}
