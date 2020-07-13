package Patinete;

public class ExecutarPatinete {
	
	public static void main(String[] args) {

	    Patinete patinete1 = new Patinete("Azul", "Caloi", 149);
	    Patinete patinete2 = new Patinete("Rosa", "Oxelo", 154);
        System.out.println(patinete1.mostrarDados());
        System.out.println("\n");
        System.out.println(patinete2.mostrarDados());
		
	}

}
