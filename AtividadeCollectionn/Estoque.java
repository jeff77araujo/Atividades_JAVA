package AtividadeCollectionn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Collection<String> garagem = new ArrayList();
		int opcao;
		String carro;
		
		do {
				System.out.println("GARAGEM - SELECIONE UMA OPÇÃO:");
				System.out.println("(1) Adicionar carro:");
				System.out.println("(2) Deletar carro:");
				System.out.println("(3) Ver garagem:");
				System.out.println("(4) Limpar garagem:");
				System.out.println("(5) Sair:");
				opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do Carro: ");
				carro = ler.next();
				garagem.add(carro);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Digite o carro para excluir: ");
				carro = ler.next();
				garagem.remove(carro);
				break;
			case 3:
				System.out.println("GARAGEM: ");
				if (garagem.isEmpty()) {
					System.out.println("Não tem carros na garagem, adicione algum! \n");
				} else {
					for (String carros : garagem) {
						System.out.println("Carro: "+ carros + "\n");
					}
				}
				break;
			case 4:
				System.out.println("Tem certeza que deseja EXCLUIR todos os carros? S/N ");
				String SN = ler.next();
					if (SN == "s") {
						garagem.clear();
						System.out.println("Garagem Vazia! \n");
					} else if (SN == "n") {
						System.out.println("Nada foi excluído! \n");
					}
					break;
			case 5:
				System.out.println("Garagem fechada!!");
				break;
			default:
				System.out.println("Número inválido!");
			}
			
		} while (opcao != 5);
	}
}
