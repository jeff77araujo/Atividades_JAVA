package metodoSobrecarregados;

public class ClasseInterfaceParticipante implements InterfaceLeitor, InterfaceProgramador {
	String pensamento;
	public String leitor() {
		return "Forum";
	}
	public void pensando(char[] ideias) {
		pensamento = new String(ideias);
	}
	public String digitando() {
		return pensamento;
	}
	private String aprendendo() {
		return "JAVA";
	}
}
