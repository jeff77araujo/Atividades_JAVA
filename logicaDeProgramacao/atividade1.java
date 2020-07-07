package logicaDeProgramacao;

import java.util.Scanner;

public class atividade1 {

	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int ano, mes, dia, diasEmAno, diasEmMeses, total;
		
		System.out.printf("Digite seus anos: ");
		ano = leitura.nextInt();
		System.out.printf("Digite seus meses: ");
		mes = leitura.nextInt();
		System.out.printf("Digite seus dias: ");
		dia = leitura.nextInt();
		
		diasEmAno = ano * 365;
		diasEmMeses = mes * 30;
		total = diasEmAno + diasEmMeses + dia;
		System.out.printf("Seu total de vida em dias é: " + total);
	}
}