
import java.util.Scanner;

public class ExerEstruturaSequencial3 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B;
		double C, Salary;
		
		
		System.out.println("Digite o número do funcionario: ");
		A = entrada.nextInt();
		
		System.out.println("O número de horas trabalhadas: ");
		B = entrada.nextInt();
		
		System.out.println("O valor por hora trabalhada: ");
		C = entrada.nextDouble();
		
		Salary = (B * C);
		
		System.out.println("Number:" + A);
		System.out.printf("Salary = U$ %.2f%n", Salary);
		
		
		
		
		
		
		entrada.close();
	}

}
