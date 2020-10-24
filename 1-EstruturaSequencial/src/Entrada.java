
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = entrada.next();
		y = entrada.nextInt();
		z = entrada.nextDouble();
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		
		entrada.close();
	}

}
