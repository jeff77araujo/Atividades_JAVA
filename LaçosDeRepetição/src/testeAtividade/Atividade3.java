package testeAtividade;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade, menorDeVinteUm = 0, maiorDeCinquenta = 0;
		boolean cond = true;
		
		while(cond == true) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
				if (idade < 21) {
					menorDeVinteUm++;
				} else if (idade > 50) {
					maiorDeCinquenta++;
				} else if (idade == -99) {
					cond = false;
				} 
			}
		System.out.println("Total de menores que 21 anos: " + menorDeVinteUm);
		System.out.println("Total de maiores que 50 anos: " + maiorDeCinquenta);
		}
}
