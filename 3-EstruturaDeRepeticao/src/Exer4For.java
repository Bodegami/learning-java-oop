import java.util.Locale;
import java.util.Scanner;

public class Exer4For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div =  (double) x / y; //operador de coersão de tipos
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}

}
