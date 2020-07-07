package logicaDeProgramacao;

import java.util.Scanner;

public class atividade3 {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int segundos, horas, minutos, resultado;
		
		System.out.printf("Digite quanto tempo durou o evento em segundos: ");
		segundos = leitura.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.printf("O seu evento durou: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	}
}
