import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		int time;
		
		
		
		System.out.println("Quantas horas?");
		time = entrada.nextInt();
		
		if(time < 12) {
			System.out.println("Bom dia");
		}
		else if (time < 18) {
			System.out.println("Boa tarde");
		}
		else {	
			System.out.println("Boa noite");
		}
		
		entrada.close();
		
	}
 
}
