package aviao;

public class Aviao {
	private String nomeCia;
	private String destinoVoo;
	private int numVoo;

	public Aviao (String nomeC, String destinoV, int numV) {
		nomeCia = nomeC;
		destinoVoo = destinoV;
		numVoo = numV;
	}

	public String mostrarDados() {
		String informacoes = "Nome da Companhia �erea: "+ nomeCia +" - Destino: "+ destinoVoo +" - N�mero do Voo: "+ numVoo;

		return informacoes;
	}
}

