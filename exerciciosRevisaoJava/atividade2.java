package exerciciosRevisãoJAVA;

import java.util.Scanner;

public class atividade2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, calculo;
		
		System.out.println("Digite seu peso: ");
		peso = ler.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = ler.nextDouble();
		
		calculo = peso / (altura * altura);
		
		if (calculo < 18.5) {
			System.out.println("Seu IMC: " + calculo);
			System.out.println("Abaixo do peso!");
		} else if (calculo >= 18.5 && calculo <= 25) {
			System.out.println("Seu IMC: " + calculo);
			System.out.println("Peso normal!");
		} else if (calculo >= 25 && calculo < 30) {
			System.out.println("Seu IMC: " + calculo);
			System.out.println("Acima do peso!");
		} else if (calculo >= 30) {
			System.out.println("Seu IMC: " + calculo);
			System.out.println("Obeso!");
		}
	}
}
