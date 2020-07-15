package atividadeSuperClass;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;

	public Operario() {super();} // SUPER

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	public double calcularValor() {
		double valorFinal = valorProducao + (valorProducao*comissao/100);
	    return valorFinal;
	}
}