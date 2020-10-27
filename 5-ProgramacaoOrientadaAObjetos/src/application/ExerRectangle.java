package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleExer;

public class ExerRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		RectangleExer rectangle = new RectangleExer();
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.Area();
		double perimeter = rectangle.Perimeter();
		double diagonal = rectangle.Diagonal();
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PERIMETER: %.2f%n", perimeter);
		System.out.printf("DIAGONAL: %.2f%n", diagonal);
		
		sc.close();

	}

}
