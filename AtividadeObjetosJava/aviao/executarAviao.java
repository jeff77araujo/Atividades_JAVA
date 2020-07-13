package aviao;

public class ExecutarAviao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao aviao1 = new Aviao("GOL", "RJ", 775);
		Aviao aviao2 = new Aviao("AZUL", "SC", 789);
		
		System.out.println(aviao1.mostrarDados());
		
		System.out.println(aviao2.mostrarDados());
	}
}
