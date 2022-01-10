package entities;

public class Product {

	private String name;
	private Double priceDouble;
	
	public Product() {
		
	}

	public Product(String name, Double priceDouble) {
		super();
		this.name = name;
		this.priceDouble = priceDouble;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPriceDouble() {
		return priceDouble;
	}

	public void setPriceDouble(Double priceDouble) {
		this.priceDouble = priceDouble;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", priceDouble=" + priceDouble + "]";
	}

	
	
	
}
