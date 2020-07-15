package atividadeSuperClass;

public class Main {
	public static void main(String args[]) {
		Pessoa pessoa = new Pessoa();
		Fornecedor fornecedor = new Fornecedor();
		Empregado empregado = new Empregado();
		Administrador administrador = new Administrador();
		Operario operario = new Operario();
		Vendedor vendedor = new Vendedor();
		
		System.out.println("1 - PESSOA:");
		pessoa.setNome("Jefferson");
		pessoa.setEndereco("Rua Ana Paulina, 987");
		pessoa.setTelefone("(11) 99999-9999");
		System.out.println("NOME: " + pessoa.getNome());
		System.out.println("ENDEREÇO: " + pessoa.getEndereco());
		System.out.println("TELEFONE: " + pessoa.getTelefone());
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("2 - FORNECEDOR:");
		fornecedor.setNome("Coca-Cola");
		fornecedor.setEndereco("Av. Principal, 1500");
		fornecedor.setTelefone("(11) 99999-0000");
		fornecedor.setValorCredito(500);
		fornecedor.setValorDivida(150);
		System.out.println("NOME: " + fornecedor.getNome());
		System.out.println("ENDEREÇO: " + fornecedor.getEndereco());
		System.out.println("TELEFONE: " + fornecedor.getTelefone());
		System.out.println("SALDO DO FORNECEDOR: R$" + fornecedor.obterSaldo());
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("3 - EMPREGADO:");
		empregado.setNome("Roberto");
		empregado.setEndereco("Rua da Graça, 675");
		empregado.setTelefone("(11) 98765-4321");
		empregado.setSalarioBase(250.0);
		empregado.setImposto(15.0);
		System.out.println("NOME: " + empregado.getNome());
		System.out.println("ENDERÇO: " + empregado.getEndereco());
		System.out.println("TELEFONE: " + empregado.getTelefone());
		System.out.println("SALARIO FINAL: R$" + empregado.calcularSalario());
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("4 - ADMINISTRADOR:");
		administrador.setNome("Paty");
		administrador.setEndereco("Rua Doze de Outubro, 12");
		administrador.setTelefone("(11) 12345-6789");
		administrador.setCustoEstadia(150.0);
		administrador.setCustoViagem(100.0);
		System.out.println("NOME: " + administrador.getNome());
		System.out.println("ENDERÇO: " + administrador.getEndereco());
		System.out.println("TELEFONE: " + administrador.getTelefone());
		System.out.println("AJUDA DE CUSTO: R$" + administrador.ressarcimento());
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("5 - OPERÁRIO:");
		operario.setNome("Renan");
		operario.setEndereco("Rua do Interior, 80");
		operario.setTelefone("(12) 95132-9875");
		operario.setValorProducao(150.0);
		operario.setComissao(20.0);
		System.out.println("NOME: " + operario.getNome());
		System.out.println("ENDERÇO: " + operario.getEndereco());
		System.out.println("TELEFONE: " + operario.getTelefone());
		System.out.println("VALOR FINAL: R$" + operario.calcularValor());
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("6 - VENDEDOR:");
		vendedor.setNome("Luan");
		vendedor.setEndereco("Rua da Escola, 9");
		vendedor.setTelefone("(11) 45695-7896");
		vendedor.setValorVendas(150.0);
		vendedor.setComissao(10.0);
		System.out.println("NOME: " + vendedor.getNome());
		System.out.println("ENDERÇO: " + vendedor.getEndereco());
		System.out.println("TELEFONE: " + vendedor.getTelefone());
		System.out.println("VALOR FINAL: R$" + vendedor.calcularValor());
	}
}