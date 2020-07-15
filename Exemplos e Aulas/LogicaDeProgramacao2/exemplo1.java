package LacoDeRepeticao;

import java.util.Scanner;

public class exemplo1 {
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("Entre com o número: ");
		num = entrada.nextInt();
		if (num > 0) {
			System.out.println("Número positivo...");
		} else if (num < 0) {
			System.out.println("Número negativo...");
		} else {
			System.out.println("É zero...");
		}
	}
}