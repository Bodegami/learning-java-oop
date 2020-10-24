import java.util.Scanner;

public class ExerEstruturaCondicional3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % 2 == 0 || B % 2 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();
		
	}

}
