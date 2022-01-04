package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private int quantity;
	
	private double price;
	
	private Product produto;
	
	public OrderItem() {
		
	}	

	public OrderItem(int quantity, double price, Product produto) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return price*quantity;
	}
	
	@Override
	public String toString() {
		return getProduto().getName() + ", $" + String.format("%.2f", price)+
				", Quantity: "+ quantity+
				", Subtotal: " + String.format("%.2f", subTotal());
	}

}
