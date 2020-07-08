package testeAtividade;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int perfil, sexo, fem= 0, masc= 0, idade, deMenor= 0, deMaior= 0, calma= 0, nervo= 0, agress= 0, cont= 0;
		
		while(cont < 3) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.println("Digite 1 (Feminino) ou 2 (Masculino): ");
			sexo = ler.nextInt();
			System.out.println("Digite se você é: 1 (Calmo), 2(Nervoso), 3(Agressivo): ");
			perfil = ler.nextInt();
				if (perfil == 1) {
					if (idade < 18) {
						calma++;
						deMenor++;
					} else {
						calma++;
					}
				} else if (perfil == 2) {
					if (idade > 40) {
						deMaior++;
						nervo++;
							if (sexo == 1) {
								fem++;
								nervo++;
							} else {
							nervo++;
							}
					} else {
						nervo++;
					}
				} else if (perfil == 3) {
						if (sexo == 2) {
							agress++;
							masc++;
						} else {
							agress++;
						}
					}
				}
				cont++;
		}
		System.out.println("Pessoas CALMAS: " + calma);
		System.out.println("Pessoas NERVOSAS: " + nervo);
		System.out.println("Pessoas AGRESSIVAS: " + agress);
		System.out.println("Mulheres NERVOSAS: " + fem);
		System.out.println("Homens AGRESSIVOS: " + masc);
		System.out.println("Maiores de 40 anos NERVOSOS: " + deMaior);
		System.out.println("Menores de 18 anos CALMOS: " + deMenor);
		}
	}
}
