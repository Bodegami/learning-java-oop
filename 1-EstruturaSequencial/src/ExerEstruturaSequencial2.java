import java.util.Scanner;

public class ExerEstruturaSequencial2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, total;
		
		
		
		System.out.println("Digite um n�mero:");
		A = entrada.nextInt();
		
		System.out.println("Digite um n�mero:");
		B = entrada.nextInt();
		
		System.out.println("Digite um n�mero:");
		C = entrada.nextInt();
		
		System.out.println("Digite um n�mero:");
		D = entrada.nextInt();
		
		total = ( A * B - C * D);
		
		System.out.println("Diferen�a = " + total);
		
		entrada.close();
	}

}
