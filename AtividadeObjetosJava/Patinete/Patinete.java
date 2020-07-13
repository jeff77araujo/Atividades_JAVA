package Patinete;

public class Patinete {
	
	private String cor;
	private String marca;
	private double preco;

	public Patinete(String cor, String marca, double preco) {

		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
	}

	public String mostrarDados() {
		String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nPreço: " + preco;
		return informacao;
	}
}
