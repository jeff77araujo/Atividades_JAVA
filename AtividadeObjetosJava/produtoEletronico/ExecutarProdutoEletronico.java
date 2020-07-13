package produtoEletronico;

public class ExecutarProdutoEletronico {
	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico("TV","Samsung",3499.99);
		ProdutoEletronico produto2 = new ProdutoEletronico("Notebook","ACER",3199.99);
	System.out.println(produto1.mostrarDados());
	
	System.out.println(produto2.mostrarDados());
	}

}
