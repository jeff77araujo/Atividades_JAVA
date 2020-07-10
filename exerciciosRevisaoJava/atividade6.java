package exerciciosRevisãoJAVA;

import java.util.Scanner;

public class atividade6 {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int[] vetor = new int[3];
		int[] multi1 = new int[3];
		int[][] matriz = new int[3][3];
		int[][] multi = new int[3][3];
		int l, c, i;
		
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite números para o VETOR: ");
			vetor[i] = ler.nextInt();
		}
		for (l = 0; l < matriz.length; l ++) {
			for (c = 0; c < matriz.length; c ++) {
				System.out.println("Digite números para a MATRIZ: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.println("Nova Matriz somada é:");
		
		for (i = 0; i < vetor.length; i++) {
			for (c = 0; c < matriz.length; c ++) {
			multi[i][c] = vetor[i] * matriz[c][i];
			System.out.println("Posição: " + matriz[i][c] + " = " + multi[i][c]);
			}
		}
	}
}
