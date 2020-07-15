package AtividadeHerançaPolimorfismo;

abstract public class Animal {
	private String nome;
	private int idade;
	
	abstract public void emitirSom();
	abstract public void movimento();
	
	public Animal() {}
	
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return "NOME: "+ nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return "IDADE: "+ idade +" anos";
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
