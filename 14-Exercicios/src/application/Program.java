package application;

public class Program {

	public static void main(String[] args) {
		
		double [][] notasAlunos= new double [3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (int linhas = 0; linhas < notasAlunos.length; linhas++) {
			for(int colunas = 0; colunas < notasAlunos[linhas].length; colunas++) {
				System.out.print(notasAlunos[linhas][colunas] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a m�dia de cada aluno: ");
		
		double soma = 0;
		for (int linhas = 0; linhas < notasAlunos.length; linhas++) {
			soma = 0;
			for(int colunas = 0; colunas < notasAlunos[linhas].length; colunas++) {
				soma += notasAlunos[linhas][colunas];
			}
			System.out.println("M�dia do aluno " + linhas + " � = " + (soma/4));
		}
		
		double [][] notasAlunos2 = {{1, 2, 3 ,4}, {5, 6, 7 ,8}, {9, 0, 1 ,2}};
		
		System.out.println("Output da Matriz notasAlunos2: ");
		
		for (int i = 0; i < notasAlunos2.length; i++) {
			for(int j = 0; j < notasAlunos2[i].length; j++) {
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
		
		
		
	}

}
