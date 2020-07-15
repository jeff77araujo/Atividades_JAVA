package metodoSobrecarregados;

public class TesteExemploPessoa1 extends ExemploPessoa {
		private String departamento;
		
		public TesteExemploPessoa1 (String nome, int matricula, String departamento) {
			super(nome, matricula);
			this.departamento = departamento;
	}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		
}
