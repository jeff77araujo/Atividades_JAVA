package metodoSobrecarregados;

public class TesteClassInterface {
	public static void main (String args[]) {
		ClasseInterfaceParticipante participante = new ClasseInterfaceParticipante();
		String java = "JAVA na veia";
		
		InterfaceLeitor leitor = participante;
		InterfaceProgramador programador = participante;
		programador.pensando(java.toCharArray());
		
		System.out.println("O participdante está lendo: "+ leitor.leitor());
		System.out.println("E programando: "+ programador.digitando());
	}

}
