package testeAtividade;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			soma += num;
			
		} while (num != 0);
		System.out.println("Soma total dos números é: " + soma);
	}
}
