package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);		
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId()  == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage:");
		}
		
		
		System.out.println("List of employess:");
		System.out.println(list.toString());
				
		sc.close();
	}

}
