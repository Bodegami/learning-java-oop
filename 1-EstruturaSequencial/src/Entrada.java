
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
		
		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou: " + z);
		
		entrada.close();
	}

}
