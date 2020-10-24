import java.util.Scanner;

public class Exerc1While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		
		int x = sc.nextInt();
		
		
		while (x != 2002) {
			
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		} 
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}
	
}
