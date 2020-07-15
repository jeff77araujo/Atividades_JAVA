package metodoSobrecarregados;

public class TestaHerança {
	public static void main(String args[]) {
		ExemploPessoa jeff = new ExemploPessoa("Jeff", 123);
		TesteExemploPessoa1 suelen = new TesteExemploPessoa1("Suelen", 321, "Marketing");
		ExemploPessoa roberto = new TesteExemploPessoa1("Roberto", 456, "Tecnologia da Informação");
		ExemploPessoa patricia = new TesteExemploCoordenador("Patrícia", 654, "Enfermeira");
		
		System.out.println(suelen.getDepartamento());
		System.out.println(patricia.getMatricula());
		System.out.println(jeff.getNome());
		System.out.println(roberto.getNome());
	}
}
