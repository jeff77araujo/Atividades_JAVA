package LacoDeRepeticao;

import java.util.Scanner;

public class exemplo1 {
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("Entre com o n�mero: ");
		num = entrada.nextInt();
		if (num > 0) {
			System.out.println("N�mero positivo...");
		} else if (num < 0) {
			System.out.println("N�mero negativo...");
		} else {
			System.out.println("� zero...");
		}
	}
}