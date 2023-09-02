package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();    
	        productsList.add(new Product(1,"HP Laptop",25000f));    
	        productsList.add(new Product(2,"Dell Laptop",30000f));    
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));    
	        productsList.add(new Product(4,"Sony Laptop",28000f));    
	        productsList.add(new Product(5,"Apple Laptop",90000f)); 
	        
	    Product A = productsList.stream().max((p1, p2)-> p1.price>p2.price? 1:-1).get();
	    System.out.println(A.price);
	    Product B = productsList.stream().min((p1, p2)-> p1.price>p2.price? 1:-1).get();
	    System.out.println(B.price);
	    
	   long count = productsList.stream().filter(p->p.price<30000).count();
	   System.out.println(count);
	   
	   Set<Float> collect = productsList.stream().filter(p->p.price<30000).map(p->p.price).collect(Collectors.toSet());
	   System.out.println(collect);
	}

}
