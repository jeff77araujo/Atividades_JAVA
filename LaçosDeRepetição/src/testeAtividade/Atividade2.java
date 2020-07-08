package testeAtividade;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, par = 0, impar = 0, x;
		
		for (x = 0; x < 10; x++) {
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Temos " + par + " números Pares");
		System.out.println("Temos " + impar + " números Impares");
	}
}
