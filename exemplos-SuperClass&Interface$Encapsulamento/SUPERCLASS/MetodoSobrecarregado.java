package metodoSobrecarregados;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados() {
		System.out.printf("Salário inteiro: %d\n", salario(700));
		System.out.printf("Salário double: %f\n", salario(750.500));
	}
	public int salario(int valorInt) {
		System.out.printf("\n Salario com argumento inteiro: %d\n", valorInt);
		return valorInt*2;
	}
	public double salario(double valorDouble) {
		System.out.printf("\n Salario com argumento inteiro: %d\n", valorDouble);
		return valorDouble*valorDouble;
	}
}