package Day05;

import java.util.Comparator;
import java.util.List;

class Mycmp  implements Comparator<Product>{

@Override
public int compare(Product o1, Product o2) {
	
	return  (int)(o1.getPrice() - o2.getPrice());
}

}
public class Sortproduct {
	public static void main(String[]args) {
		 List<Product> P = Dataproduct.getproduct();
		 System.out.println("THE LIST OF MOBLIE PRODUCTS ARE");
		 P.stream().filter(x -> 1==(x.getPid())).forEach(System.out::println);
		 System.out.println("\n");
		 
		 Comparator<Product> comparator = Comparator.comparing( Product::getPrice );
		 Product maxObject = P.stream().max(comparator).get();
		 System.out.println("The product with MAX PRICE is " + maxObject);
		 System.out.println("\n");
		 
		 
		 System.out.println("THE LIST OF PRODUCT IN INCREASING ORDER");
		  P
	     .stream()
		 .sorted((o1,o2)->(int)(o1.getPrice() - o2.getPrice()))
		 .forEach(System.out::println);
		  System.out.println("\n");
		  System.out.println("THE LIST OF PRODUCT IN DECEARSING ORDER");
		  
		  P
	     .stream()
		 .sorted((o1,o2)->(int)(o2.getPrice() - o1.getPrice()))
		 .forEach(System.out::println);
		  
	}
}