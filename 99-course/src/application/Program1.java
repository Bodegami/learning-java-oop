package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product1 product = new Product1();
		
		System.out.println("Enter the product data:");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		product.toString();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: " );
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: " );
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		

		
		sc.close();
	}
}
