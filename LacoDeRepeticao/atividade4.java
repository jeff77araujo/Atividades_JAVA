package LacoDeRepeticao;

import java.util.Scanner;

public class atividade4 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double numero, raiz, potencia;
		
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("N�mero PAR: "+ numero);
			System.out.println("Raiz quadrada �: " + raiz);
		} else {
			potencia = Math.pow(numero, 2);
			System.out.println("N�mero �MPAR: " + numero);
			System.out.println("Potencia �: " + potencia);
		}
		
	}
}

