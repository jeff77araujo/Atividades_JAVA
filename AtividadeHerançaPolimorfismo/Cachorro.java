package AtividadeHerançaPolimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super("Lesse", 3);
	}
	
	public void emitirSom() {
		System.out.println("Au au au au au...");
	}
	
	public void movimento() {
		System.out.println("Toto está correndo!");
	}
}
