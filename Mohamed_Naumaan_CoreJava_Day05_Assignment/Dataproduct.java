package Day05;

import java.util.ArrayList;
import java.util.List;
public class Dataproduct {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Product> getproduct(){
		 List<Product> p=new ArrayList();
		 p.add(new Product( 1 , "NOKIA",2000));
		 p.add(new Product( 1 , "MI",40000));
		 p.add(new Product( 1 , "SAMSUNG",10890));
		 p.add(new Product( 1 , "XIPHONE",3000));
		 p.add(new Product( 2 , "IRON BOX",2300));
		 p.add(new Product( 3 , "SOFA",12000));
		 p.add(new Product( 4 , "AIR COOLER",45000));
		 p.add(new Product( 5 , "WASHING MACHINE",12000));
		 return p;
	}

}
