package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name2 = sc.nextLine();
		
		System.out.println("Price: ");
		double price2 = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		int quantity2 = sc.nextInt();
		
		Product product = new Product(name2, price2, quantity2);
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity2 = sc.nextInt();
		product.AddProducts(quantity2);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity2 = sc.nextInt();
		product.RemoveProducts(quantity2);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}

