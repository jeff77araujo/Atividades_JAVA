package Paciente;

public class ExecutarPaciente {
	public static void main(String[] args) {

		Paciente paciente1 = new Paciente("Jeff", 27, "grave");
		Paciente paciente2 = new Paciente("Suelen", 26, "normal");
		System.out.println(paciente1.laudoPaciente());
		System.out.println("\n");
		System.out.println(paciente2.laudoPaciente());
		
		
	}

}
