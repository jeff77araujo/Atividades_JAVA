package LacoDeRepeticao;

import java.util.Scanner;

public class exemplo2 {
	public static void main (String args[]) {
		float num1, num2, resultado;
		int opcao;
		Scanner entrada = new Scanner (System.in);
		while (true) {
			System.out.println("Entre com o primeiro n�mero: ");
			num1 = entrada.nextFloat();
			System.out.println("Entre com o segundo n�mero: ");
			num2 = entrada.nextFloat();
			System.out.println("1-Soma, 2-Diferen�a, 3-Multiplica��o, 4-Divis�o: ");
			opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("Soma �: " + resultado + "\n");
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("Diferen�a �: " + resultado + "\n");
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println("Multiplica��o �: " + resultado + "\n");
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("N�o existe divis�o por ZERO!!");
			} else {
				resultado = num1 / num2;
				System.out.println("Divis�o �: " + resultado + "\n");
			}
			break;
		default:
			System.out.println("Op��o inv�lida!!");
			}
		}
	}
}
