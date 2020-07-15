package AtividadeCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) {
		Collection<String> item = new ArrayList();
		item.add("Peças");
		item.add("Acessários");
		item.add("Material");
		item.add("Extras");
		System.out.println("Estoque: " + item);
		
		System.out.println("--------------------------------------------------------------");
		item.remove("Extras");
		System.out.println("Atualizado: " + item);
		
		System.out.println("--------------------------------------------------------------");
		item.clear();;
		System.out.println("Limpeza geral: " + item);
		
		System.out.println("--------------------------------------------------------------");
		if (item.isEmpty()) {
			System.out.println("Estoque vazio");
		} else {
			System.out.println("Itens do estoque: "+ item);
		}
	
	}
}
