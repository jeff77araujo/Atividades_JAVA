package produtoEletronico;

public class ProdutoEletronico {
	private String nomeProduto;
	private String marcaProduto;
	private double valorProduto;

	public ProdutoEletronico (String nomeP, String marcaP, double valorP) {
		nomeProduto = nomeP;
		marcaProduto = marcaP;
		valorProduto = valorP;
	}

	public String mostrarDados() {
		String informacoes = "Produto: "+ nomeProduto +" - Marca: "+ marcaProduto +" - Preço: "+ valorProduto;
		return informacoes;
	}
}
