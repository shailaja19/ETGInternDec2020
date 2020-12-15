package com.sonata;

public class Sedan extends Car{
	int length;
	
	Sedan() {}
	
	Sedan(int a,double b,String c,int d) {
		super(a,b,c);
		this.length=d;
	}
	
	double getSalePrice() {
		{
		if(length>20)
			regularPrice=(regularPrice-(regularPrice*0.05));
		else
			regularPrice=(regularPrice-(regularPrice*0.1));
		}
		return regularPrice;
	}
}
