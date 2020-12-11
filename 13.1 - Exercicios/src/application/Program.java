package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][] mat = new int [M][N];
		
		for(int i=0; i < mat.length; i++) {
			for (int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int X = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == X) {
					System.out.println("Position " + i + ", " + j + ":");
					
				}
			}
		}
		
		System.out.println();
		
		
		
		sc.close();
	}

}
