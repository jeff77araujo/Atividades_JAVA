package LacoDeRepeticao;

import java.util.Scanner;

public class atividade1 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int i, num1, num2, num3, maiorNum=0; 

			System.out.println("Digite um n�mero: ");
			num1 = entrada.nextInt();
			System.out.println("Digite um n�mero: ");
			num2 = entrada.nextInt();
			System.out.println("Digite um n�mero: ");
			num3 = entrada.nextInt();
			
			maiorNum = num1;
			
				if (maiorNum < num2 && num2 > num3) {
					maiorNum = num2;
						System.out.println("Maior n�mero �: " + num2);
				} else if (maiorNum < num3 && num3 > num2) {
					maiorNum = num3;
					System.out.println("Maior n�mero �: " + num3);
				} else {
					maiorNum = num1;
					System.out.println("Maior n�mero �: " + num1);
				}
		}
}
