 package Cliente;

public class ExecutarCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente ("Jeff", "SP", 27);
		System.out.println(cliente1.mostrarDados());
		
		Cliente cliente2 = new Cliente ("Suelen", "SP", 26);
		System.out.println(cliente2.mostrarDados());
	}

}