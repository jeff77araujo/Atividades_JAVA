package ContaBancaria;

public class ContaBancaria {
	private String nomeBanco;
	private String titular;
	private int agenciaConta;
	private int numConta;


	public ContaBancaria(String nameBank, String nomeTitular, int agenciaC, int numeroC) {
		nomeBanco = nameBank;
		titular = nomeTitular;
		agenciaConta = agenciaC;
		numConta = numeroC;

	}
	
	public String mostrarDados() {
		String dadosConta= "Banco: "+ nomeBanco +"\nTitular: "+ titular +"\nAgência: "+ agenciaConta +"\nConta: "+ numConta;
		return dadosConta;
	}
}
