package ExercicosVetorEMatriz;

import java.util.Scanner;

public class matriz1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int [][] matriz = new int [3][3];
		int vezes = 0;
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c = 0; c < matriz.length; c++ ) {
				System.out.println("Digite um número: ");
				matriz[l][c] = ler.nextInt();
				if (matriz[l][c] > 10) {
					vezes += 1;
				}
			}
		}
		System.out.println("Foram digitados " + vezes + " números 10.");
	}
}
