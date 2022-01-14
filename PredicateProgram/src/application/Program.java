package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		1a versao
//		list.removeIf(p -> p.getPrice()>=100);

//		2a versao
//		list.removeIf( new ProductPredicate() );
		
//		3a versao
//		list.removeIf( Product::staticProductPredicate );	
		
//		4a versao
//		list.removeIf( Product::nonStaticProductPredicate );		

//		5a versao
//		double min = 100.00;
//		Predicate<Product> pred = p -> p.getPrice()>=min;
//		list.removeIf( pred );		

		//6a versao
		double min = 100.00;
		list.removeIf( p -> p.getPrice()>=min );	
		
		for(Product p : list) {
			
			System.out.println(p);
		}
		
		
		
		
	}
}