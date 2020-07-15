package atividadeSuperClass;

public class Fornecedor extends Pessoa {

		private double valorCredito;
		private double valorDivida;
		private double obterSaldo;
		
		public Fornecedor (double valorCredito, double valorDivida) {
			
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}
		
		public Fornecedor () {super();} // SUPER
		
		public double getValorCredito() {
			return valorCredito;
		}
		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}
		public double getValorDivida() {
			return valorCredito;
		}
		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
		public double obterSaldo() {
			double saldo = valorCredito - valorDivida;
			return saldo;
		}
}
