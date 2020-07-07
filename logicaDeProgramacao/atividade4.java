package logicaDeProgramacao;

import java.util.Scanner;

public class atividade4 {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int a, b, c;
		double potenciaR, potenciaS, soma1, soma2, resultado;
		
		System.out.printf("Digite um número inteiro positivo: ");
		a = leitura.nextInt();
		System.out.printf("Digite outro número inteiro positivo: ");
		b = leitura.nextInt();
		System.out.printf("Digite mais outro número inteiro positivo: ");
		c = leitura.nextInt();
		
		soma1 = a + b;
		soma2 = b + c;
		potenciaR = Math.pow(soma1, 2);
		potenciaS = Math.pow(soma2, 2);
		
		resultado = (potenciaR + potenciaS) / 2;
		
		System.out.printf("Resultado é: " + resultado);
	}
}