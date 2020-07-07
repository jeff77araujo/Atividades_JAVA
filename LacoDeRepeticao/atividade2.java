package LacoDeRepeticao;

import java.util.Scanner;

public class atividade2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3; 

			System.out.println("Digite um número: ");
			num1 = entrada.nextInt();
			System.out.println("Digite um número: ");
			num2 = entrada.nextInt();
			System.out.println("Digite um número: ");
			num3 = entrada.nextInt();
			
			
				if (num1 < num2 && num2 < num3) {
						System.out.println("Ordem Crescente: " + num1 + ", " + num2 + ", " + num3);
				} else if (num1 < num3 && num3 < num2) {
					System.out.println("Ordem Crescente: " + num1 + ", " + num3 + ", " + num2);
				} else if (num2 < num3 && num3 < num1) {
					System.out.println("Ordem Crescente: " + num2 + ", " + num3 + ", " + num1);
				} else if (num2 < num1 && num1 < num3) {
					System.out.println("Ordem Crescente: " + num2 + ", " + num1 + ", " + num3);
				} else if (num3 < num1 && num1 < num2) {
					System.out.println("Ordem Crescente: " + num3 + ", " + num1 + ", " + num2);
				} else {
					System.out.println("Ordem Crescente: " + num3 + ", " + num2 + ", " + num1);
				} 
		}
}
