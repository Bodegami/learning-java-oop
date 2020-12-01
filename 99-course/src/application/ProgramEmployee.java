package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee f;
		f = new Employee();
		
		System.out.println("Name: ");
		f.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		f.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		f.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + f);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		f.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("updated data: " + f);
		
		sc.close();
	}

}
