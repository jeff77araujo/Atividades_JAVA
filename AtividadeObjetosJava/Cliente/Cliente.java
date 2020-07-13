package Cliente;

public class Cliente {

	private String nomeCliente;
	private String localCliente;
	private int idadeCliente;
	
	public Cliente(String nome, String estado, int idade) {
		nomeCliente = nome;
		localCliente = estado;
		idadeCliente = idade;
	}
	
	public String mostrarDados() {
		String informacoes = nomeCliente + " " + idadeCliente +" "+ localCliente; 
		return informacoes;
	}
	
	
}