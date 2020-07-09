package ExercicosVetorEMatriz;

import java.util.Scanner;

public class vetor2 {
	public static void main(String arg[]) {
		Scanner ler = new Scanner (System.in);
		int [] numeros = new int[6], pares = new int[6], impares = new int[6];
		int i, somaPar = 0, quantImpar = 0;
		
		for (i = 0; i < 6; i++) {
			System.out.println("Entre com um número: ");
			numeros[i] = ler.nextInt();
		}
			
		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("PAR: " + numeros[i]); // A
				somaPar += numeros[i]; // B
			} else {
				System.out.println("IMPAR: " + numeros[i]);  // C
				quantImpar += 1; // D
			}
		}
		System.out.println("\nSoma dos PARES: " + somaPar);
		System.out.println("\nQuantidade de números IMPARES: " + quantImpar);
		 
	}
}
