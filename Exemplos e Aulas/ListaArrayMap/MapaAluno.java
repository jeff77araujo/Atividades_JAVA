package ListaArray;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno("João", "JAVA", 8.6);
		Aluno b = new Aluno("Maria", "Linux", 7.6);
		Aluno c = new Aluno("Diana", "SO", 9.6);
		Aluno d = new Aluno("Kaleo", "C#", 6.6);
		
		mapa.put("João", a); // put = add
		mapa.put("Maria", b);
		mapa.put("Diana", c);
		mapa.put("Kaleo", d);
		
		System.out.println("--------------------------------------------------------------");
		System.out.println(mapa);
		System.out.println("Mostrando com GET: " + mapa.get("Diana"));
		
		System.out.println("--------------------------------------------------------------");
		Collection<Aluno> alunos = mapa.values();
		
		for (Aluno e : alunos) {
			System.out.println("Vendo pelo FOR: "+ e);
		}
	}
}
