package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String option = sc.next();
		
		if (option != "y") {
			System.out.println("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			ContaBancaria contaBancaria = new ContaBancaria(number, holder, initialDeposit);			
			contaBancaria.deposit(initialDeposit);
		} 		
		
		 
		ContaBancaria contaBancaria = new ContaBancaria(number, holder);
		
		
		System.out.println("Account data: " + contaBancaria);
		
		
		
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		contaBancaria.deposit(amount);
		
		System.out.println("Account data: " + contaBancaria);
		
		
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		contaBancaria.withdraw(amount);
		
		System.out.println("Account Data: " + contaBancaria);
		
		
		
		sc.close();
	}

}
