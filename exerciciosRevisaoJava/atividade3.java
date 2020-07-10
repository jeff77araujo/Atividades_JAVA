package exerciciosRevisãoJAVA;

import javax.swing.JOptionPane;

public class atividade3 {
	public static void main(String args[]) {
		double numero;
		int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
		
		while (true) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
			
			if (numero >= 0 && numero <= 25) {
				contador1 += 1;
			} else if (numero >= 26 && numero <= 50) {
				contador2 += 1;
			} else if (numero >= 51 && numero <= 75) {
				contador3 += 1;
			} else if (numero >= 76 && numero <= 100) {
				contador4 += 1;
			} else if (numero < 0) {
				break;
			}
		}
		System.out.println("De 0 a 25: " + contador1 + " vezes digitados");
		System.out.println("De 26 a 50: " + contador2 + " vezes digitados");
		System.out.println("De 51 a 75: " + contador3 + " vezes digitados");
		System.out.println("De 76 a 100: " + contador4 + " vezes digitados");
	}
}
