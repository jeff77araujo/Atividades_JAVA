package Funcionario;

public class Funcionario {
	private String nomeFuncionario;
	private int matriculaFuncionario;

	public Funcionario(String nomeF, int matriculaF) {
		nomeFuncionario = nomeF;
		matriculaFuncionario = matriculaF;
	}

	public String mostrarDados() {
		String infos = "Nome do Funcionario: " + nomeFuncionario + "\nMatrícula: " + matriculaFuncionario;
		return infos;
	}

}
