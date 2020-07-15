package ExercicosVetorEMatriz;

import java.util.Scanner;

public class vetor1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int [] a = new int[6];
		int soma;
		
		int [] vetor = {1, 0, 5, -2, -5, 7}; // A
		soma = vetor[0] + vetor[1] + vetor[5]; // B
		vetor[4] = 100; // C
		
		for (int i = 0; i < vetor.length; i++) {
				System.out.printf("\nPosição " + (i+1)+ ": " + vetor[i]); // D
		}
		System.out.println("\nSoma das posições [0,1,5]:" + soma);
	}

}
