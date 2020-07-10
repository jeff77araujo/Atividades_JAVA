package exerciciosRevisãoJAVA;

public class atividade4 {
	public static void main(String args[]) {
		float numero = 1, calculo, soma = 0;

		for (int i = 1; i <= 50; i++) {
			calculo = numero / i;
			soma = soma + calculo;
			System.out.println(numero + " / " + i + " = " + calculo);
			numero += 2;
		}
		System.out.println("\nSOMA TOTAL: " + soma);
	}
}