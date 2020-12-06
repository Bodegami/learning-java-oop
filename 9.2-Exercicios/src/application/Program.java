package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Rooms;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Rooms[] vect = new Rooms[n];
		
		for (int i = 0; i < vect.length; i++) {
			int room = i;
			sc.nextLine();
			System.out.println("O seu quarto é: " + room);
			System.out.println("Qual o valor da diária: ");
			double rent = sc.nextDouble();
			System.out.println("Qual o seu nome: ");
			String name = sc.nextLine();
			System.out.println("Qual o seu email: ");
			String email = sc.nextLine();
			vect[i] = new Rooms(room, rent, name, email);			
			
		}
		
		for (int i = 0; i < vect.length; i++) {
			vect[i].toString();
		}
		
		
		
		sc.close();

	}

}
