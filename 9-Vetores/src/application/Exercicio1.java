package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String [] vetor = new String [n];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.next();
		}
		
		
		
		System.out.println("This is your names: " + vetor[1] + ", " + vetor[0]);
		
		
		
		
		
		
		
		sc.close();

	}

}
