package ListaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesteLista {
	public static void main(String[] args) {
		Collection<String> nomes = new ArrayList();
		nomes.add("Jeff");
		nomes.add("Suh");
		nomes.add("Paty");
		nomes.add("Beto");
		System.out.println("Lista de nomes: "+ nomes);
		
		System.out.println("--------------------------------------------------------------");
		for (String name : nomes) {
			System.out.println("Lista de nomes pelo FOR: "+ name);
		}
		
		System.out.println("--------------------------------------------------------------");
		Collection<String> nomes2 = Arrays.asList("Renan", "Luan");
		nomes.addAll(nomes2); // Adiciona dados de uma lista para outra lista de Array.
		System.out.println("Lista de nomes com adicionamento de outros nomes: "+ nomes);
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Contém o valor Suh ? "+ nomes.contains("Suh")); // Verifica se tem ou não na lista de Array.
		
		System.out.println("--------------------------------------------------------------");
		nomes.remove("Beto"); // Remove algo da lista de Array.
		System.out.println("Lista de nomes após remover um nome: "+ nomes);
		
		System.out.println("--------------------------------------------------------------");
		nomes.clear(); // Faz limpeza total da Lista de Array
		System.out.println("Lista de nomes após limpagem: "+ nomes);
		
		System.out.println("--------------------------------------------------------------");
//		if (nomes.isEmpty()) { // Mostra se tem algo dentro da Lista de Array.
//			System.out.println("Lista vazia");
//		} else {
//			System.out.println("Lista de nomes: "+ nomes);
//		}
	}

}
