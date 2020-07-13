package ContaBancaria;

public class ExecutarContaBancaria {
	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria("Itaú", "Jeff Araujo", 777, 99874);
		ContaBancaria conta2 = new ContaBancaria("Santander", "Suelen Caroline",7562, 78945);
		System.out.println(conta1.mostrarDados());
		System.out.println("\n");
		System.out.println(conta2.mostrarDados());

		
	}

}
