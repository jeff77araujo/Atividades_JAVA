package metodoSobrecarregados;

public class TesteExemploFuncionario {
	public static void main (String args[]) {
	ExemploFuncionario func = new ExemploFuncionario();
	func.setNome("Jeff");
	func.setSalario(4500);
	System.out.println(func.getNome());
	System.out.println(func.getSalario());
	}
}
