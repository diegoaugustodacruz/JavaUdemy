package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//1a versao
//		list.forEach(new PriceUpdate());
		
		//2a versao
//		list.forEach(Product :: staticProductPredicate);
		
//		3a versao
//		list.forEach(Product :: nonStaticProductPredicate);

//		4a versao
//		double factor = 2;
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice()*factor);
//		};
//		list.forEach(cons);
		
//		5a versao
		double factor = 2;
		
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		
		list.forEach(System.out::println);
	}
}
