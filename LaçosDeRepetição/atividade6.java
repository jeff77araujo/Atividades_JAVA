package testeAtividade;

import java.util.Scanner;

public class atividade6 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num, soma = 0, cont = 0, media = 0;
		
		do {
			
			System.out.println("Digite um n�mero: ");
			num = entrada.nextInt();
			soma += num;
			cont++;
			
		} while (num != 0);
		media = soma / cont;
		System.out.println("A media dos n�meros �: " + media);
	}
}

