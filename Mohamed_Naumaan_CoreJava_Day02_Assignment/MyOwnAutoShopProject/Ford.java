package com.sonata;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	Ford() {}
	
	Ford(int x,double y,String z,int year,int manDis) {
		super(x,y,z);
		this.year=year;
		this.manufacturerDiscount=manDis;
	}
	
	double getSalePrice() {
		return(regularPrice=(regularPrice-manufacturerDiscount));
	}

}
