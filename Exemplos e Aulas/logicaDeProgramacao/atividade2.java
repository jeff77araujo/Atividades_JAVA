package logicaDeProgramacao;

import java.util.Scanner;

public class atividade2 {

	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int anos, meses, dias, dia;
		
		System.out.printf("Digite seus dias de vida: ");
		dias = leitura.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		System.out.printf("Você tem: " + anos + " anos, " + meses + " meses e " + dia + " dias.");
	}
}