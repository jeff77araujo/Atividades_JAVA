package Polimorfismo2;

public class TestePessoa {
	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Suelen");
		fisica.setCpf(12345678989L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Jeff");
		juridica.setCnpj(123456489126L);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
