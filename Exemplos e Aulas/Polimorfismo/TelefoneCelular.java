package Polimorfismo;

public class TelefoneCelular extends Telefone {
	public TelefoneCelular() {
		super("Celular");
	}
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Tanananananaaaaa... Tananana... Tananana");
			break;
		case 2:
			System.out.println("Ohhhhhhhh gaaaaaaassssss...");
			break;
		default:
			System.out.println("Hello Moto!!!!");
			break;
		}
	}
	public void disca(String numero) {
		System.out.println("O número: "+ numero +" é um celular!");
	}

}
