package AtividadeHerançaPolimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super("Spirit", 5);
		}
	
	public void emitirSom() {
		System.out.println("hinn in in...");
	}
	
	public void movimento() {
		System.out.println("Trotando, trotando!");
	}
}
