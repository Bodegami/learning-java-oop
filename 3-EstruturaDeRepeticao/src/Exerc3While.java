import java.util.Scanner;

public class Exerc3While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int combustivel = sc.nextInt();
		
		while (combustivel != 4  ) {
			
			if (combustivel == 1) {
				alcool += 1;
				
			} else if (gasolina == 2) {
				gasolina += 1;
				
			} else if (diesel == 1) {
				diesel += 1;
			}
			
			combustivel = sc.nextInt();
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("MUITO OBRIGADO!");
		
		sc.close();
	}

}
