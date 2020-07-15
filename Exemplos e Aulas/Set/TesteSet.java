package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class TesteSet {
	public static void main(String[] args) {
		int count[] = {34, 22, 10, 60, 30, 22};
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			
			System.out.println("---------------------------------------------------------------------");
			TreeSet listaOrdenada = new TreeSet<Integer>(set);
			System.out.println("A lista ordenada �: "+ listaOrdenada);
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Primeiro n�mero �: "+ (Integer)listaOrdenada.first());
			System.out.println("Ultimo n�mero �: "+ (Integer)listaOrdenada.last());
		} catch (Exception e) {}
	}

}
