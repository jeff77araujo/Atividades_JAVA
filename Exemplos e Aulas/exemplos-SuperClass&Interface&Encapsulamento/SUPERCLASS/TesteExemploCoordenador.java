package metodoSobrecarregados;

public class TesteExemploCoordenador extends ExemploPessoa {
	private String coordenaCurso;
	
	public TesteExemploCoordenador(String nome, int matricula, String coordenaCurso) {
		super(nome, matricula);
		this.coordenaCurso = coordenaCurso;
	}

	public String getCoordenaCurso() {
		return coordenaCurso;
	}

	public void setCoordenaCurso(String coordenaCurso) {
		this.coordenaCurso = coordenaCurso;
	}
	

}
