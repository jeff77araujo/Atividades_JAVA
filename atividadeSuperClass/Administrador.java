package atividadeSuperClass;

public class Administrador extends Pessoa {

	private double custoEstadia;
	private double custoViagem;

	public Administrador() {super();} // SUPER

	public double getCustoEstadia() {
		return custoEstadia;
	}

	public void setCustoEstadia(double custoEstadia) {
		this.custoEstadia = custoEstadia;
	}

	public double getCustoViagem() {
		return custoViagem;
	}

	public void setCustoViagem(double custoViagem) {
		this.custoViagem = custoViagem;
	}

	public double ressarcimento() {
		double valorDaAjuda = custoViagem + custoEstadia;		
		return valorDaAjuda;
	}

}
