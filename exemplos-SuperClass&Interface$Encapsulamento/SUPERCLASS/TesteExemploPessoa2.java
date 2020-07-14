package metodoSobrecarregados;

public class TesteExemploPessoa2 extends TesteExemploPessoa1 {
	private String operacao;
	
	public TesteExemploPessoa2 (String departamento, int matricula, String operacao) {
		super(departamento, matricula, operacao);
		this.operacao = operacao;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
}