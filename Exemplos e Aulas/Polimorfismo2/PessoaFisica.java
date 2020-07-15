package Polimorfismo2;

public class PessoaFisica extends Pessoa {
	private long cpf;
	
	public PessoaFisica() {}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa F�sica: "+ super.getNome() +" - CPF: "+ this.getCpf();
	}

}
