package LacoDeRepeticao;

import java.util.Scanner;

public class exemplo2 {
	public static void main (String args[]) {
		float num1, num2, resultado;
		int opcao;
		Scanner entrada = new Scanner (System.in);
		while (true) {
			System.out.println("Entre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.println("Entre com o segundo número: ");
			num2 = entrada.nextFloat();
			System.out.println("1-Soma, 2-Diferença, 3-Multiplicação, 4-Divisão: ");
			opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("Soma é: " + resultado + "\n");
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("Diferença é: " + resultado + "\n");
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println("Multiplicação é: " + resultado + "\n");
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Não existe divisão por ZERO!!");
			} else {
				resultado = num1 / num2;
				System.out.println("Divisão é: " + resultado + "\n");
			}
			break;
		default:
			System.out.println("Opção inválida!!");
			}
		}
	}
}
