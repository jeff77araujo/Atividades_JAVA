package Paciente;

public class Paciente {
	private String nomePaciente;
	private int idadePaciente;
	private String estadoPaciente;

	public Paciente(String nomeP, int idadeP, String situacaoP) {
		nomePaciente = nomeP;
		idadePaciente = idadeP;
		estadoPaciente = situacaoP;
	}

	public String laudoPaciente() {
		String resposta;
		if (estadoPaciente == "grave") {
			resposta = "Paciente: " + nomePaciente + "\nIdade: " + idadePaciente + "\nSituação: GRAVE! \nAcomodação: UTI.";
		} else {
			resposta = "Paciente: " + nomePaciente + "\nIdade: " + idadePaciente + "\nSituação: NORMAL! \nAcomodação: Sala de descanso.";
		}
		return resposta;
	}
}
