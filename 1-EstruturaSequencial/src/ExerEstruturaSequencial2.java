import java.util.Scanner;

public class ExerEstruturaSequencial2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, total;
		
		
		
		System.out.println("Digite um número:");
		A = entrada.nextInt();
		
		System.out.println("Digite um número:");
		B = entrada.nextInt();
		
		System.out.println("Digite um número:");
		C = entrada.nextInt();
		
		System.out.println("Digite um número:");
		D = entrada.nextInt();
		
		total = ( A * B - C * D);
		
		System.out.println("Diferença = " + total);
		
		entrada.close();
	}

}
