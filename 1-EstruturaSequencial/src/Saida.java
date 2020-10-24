import java.util.Locale;

public class Saida {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x = 10.35784;
		int y = 32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.print("Olá mundo! ");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
	}

}
