package atividadeSuperClass;

public class Main {
	public static void main(String args[]) {
		Fornecedor f = new Fornecedor();
		
		f.setNome("Coca-Cola");
		f.setEndereco("Av. Principal, 1500");
		f.setTelefone("(11) 99999-0000");
		
		f.setValorCredito(550);
		f.setValorDivida(250);
		
		System.out.println(f.toString());
		f.obterSaldo();
	}
}
