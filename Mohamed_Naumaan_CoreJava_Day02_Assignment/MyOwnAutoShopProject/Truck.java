package com.sonata;

public class Truck extends Car{
	int weight;
	
	double getSalePrice() {
		{
		if(weight>2000)
			regularPrice=(regularPrice-(regularPrice*0.05));
		else
			regularPrice=(regularPrice-(regularPrice*0.1));
		}
		return regularPrice;
	}

}
