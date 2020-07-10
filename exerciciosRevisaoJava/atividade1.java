package exerciciosRevisãoJAVA;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class atividade1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		double preco, pag, desconto20, desconto15, juros10;
		int opcao;
		
		System.out.println("Digite o preço do Produto: ");
		preco = ler.nextDouble();
		System.out.println("Pagamento: A vista ou cheque (1), Crédito (2), 2 vezes (3), 3 vezes (4)");
		opcao = ler.nextInt();
		
		switch (opcao) {
		
		case 1:
			desconto20 = (preco / 100) * 80;
			System.out.println("Preço do produto: R$" + preco);
			System.out.println("Pagamento A VISTA ou CHEQUE com desconto de 20%: R$" + desconto20);
			break;
		case 2:
			desconto15 = (preco / 100) * 85;
			System.out.println("Preço do produto: R$" + preco);
			System.out.println("Pagamento a vista no CRÉDITO com desconto de 15%: R$" + desconto15);
			break;
		case 3:
			System.out.println("Preço do produto: R$" + preco);
			System.out.println("Pagamento em DUAS VEZES no CRÉDITO sem desconto: R$" + preco);
			break;
		case 4:
			juros10 = (preco / 100) * 110;
			System.out.println("Preço do produto: R$" + preco);
			System.out.println("Pagamento em TRÊS VEZES no CRÉDITO tem juros de 10%: R$" + juros10);
			break;
		default:
			System.out.println("Opçao inválida!");
		}
	}

}
