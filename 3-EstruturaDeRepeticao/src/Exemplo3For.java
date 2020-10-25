import java.util.Scanner;

public class Exemplo3For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();          //quantidade de inputs que serão somados posteriormente
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();      //valor do input
			soma += x;				  //total da soma dos inputs
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
