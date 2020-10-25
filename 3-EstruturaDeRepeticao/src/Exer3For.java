import java.util.Locale;
import java.util.Scanner;

public class Exer3For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		

		for (int i = 0; i < n; i++) {
			double real1 = sc.nextDouble();
			double real2 = sc.nextDouble();
			double real3 = sc.nextDouble();
			
			double media = (real1 * 2.0 + real2 * 3.0 + real3 * 5.0) / 10.0;
			
			
			
			System.out.printf("%.1f%n", media);
		}

		

		sc.close();
	}

}
