package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void staticProductPredicate(Product p) {
		p.setPrice(p.getPrice()*2);;
	}
	
	public void nonStaticProductPredicate() {
		setPrice(getPrice()*2);
	}
	
	@Override
	public String toString() {
		return name + ", " + price + "\n" ;
	}

	
	
	
	
}
