package exerciciosRevisãoJAVA;

public class atividade4 {
	public static void main(String args[]) {
		float numero = 1, calculo;

		for (int i = 1; i <= 50; i++) {
			calculo = numero / i;
			System.out.println(numero + " / " + i + " = " + calculo);
			numero += 2;
		}
	}
}