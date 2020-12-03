package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name2, double price2, int quantity2) {
		this.name = name2;
		this.price = price2;
		this.quantity = quantity2;
	}
	
	public Product(String name2, double price2) {
		this.name = name2;
		this.price = price2;
	}
	
	public double totalValueInStock() {
		return price * quantity;	
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity
				+ " units, Total: $" 
				+ String.format("%.2f", totalValueInStock());
	}
}
