package AtividadeHerançaPolimorfismo;

import javax.swing.JOptionPane;

public class TesteAnimal {
	public static void main(String[] args) {
		int opcao;
		Animal animal = null;
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.getIdade();
		cachorro.getNome();
		
		Cavalo cavalo = new Cavalo();
		cavalo.getNome();
		cavalo.getIdade();
		
		
		Preguica preguica = new Preguica();
		preguica.getNome();
		preguica.getIdade();
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1 (cachorro) - 2 (Cavalo) - 3 (Preguiça):"));
		
		switch (opcao) {
		case 1:
			animal = cachorro;
			break;
		case 2:
			animal = cavalo;
			break;
		case 3:
			animal = preguica;
			break;
			default:
				System.out.println("Digitou errado o número do animal, seu animal!");
		}
		animal.emitirSom();
		animal.movimento();
		System.out.println(animal.getNome());
		System.out.println(animal.getIdade());
	}
}
