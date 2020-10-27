package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ExerStundent {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("Digite o seu nome: ");
		aluno.name = sc.nextLine();
		System.out.println("Digite as três últimas notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.FinalGrade());
		
		if (aluno.FinalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points%n", aluno.missingPoints());
		} else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
