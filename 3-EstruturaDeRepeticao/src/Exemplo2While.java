import java.util.Scanner;

public class Exemplo2While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;         //or soma += x
			x = sc.nextInt();
			
		}
		
		System.out.println("O valor de X é: " + soma);
		sc.close();
	}

}
