package exerciciosRevis�oJAVA;

import javax.swing.JOptionPane;

public class atividade5 {
	public static void main(String args[]) {
		int[] numeros = new int[5], crescente = new int[5];
		int opcao;
		
		for (int i = 0; i < numeros.length; i++)
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: (0)finalizar - (1)direta -(2) inversa."));
		
		switch (opcao) {
		
		case 0:
			break;
		case 1:
			for (int i = 0; i < crescente.length; i++)
				System.out.println("n�mero: " + crescente[i]);
				break;
		case 2:
			for (int i = numeros.length; i > 0; i--)
				System.out.println("n�mero: " + numeros[i-1]);
				break;
			default:
				System.out.println("C�digo inv�lido!");
		}
	}
}
