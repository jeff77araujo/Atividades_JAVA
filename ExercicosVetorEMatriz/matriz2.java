package ExercicosVetorEMatriz;


import javax.swing.JOptionPane;

public class matriz2 {
	public static void main(String args[]) {
		
		double[][] matriz = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int l, c, contMaior = 0, opcao;
		
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				matriz[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite um  número (Matriz 1): "));
			}
		}
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				matriz2[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite um  número (Matriz 2): "));
			}
		}

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 1-Somar as matrizes, 2-Subtrair"
				+ " as duas matrizes, 3-Adicionar uma constante as duas matrizes, 4-imprimir as matrizes"));
		switch (opcao) {
		case 1:

			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matriz3[l][c] = matriz2[l][c] + matriz[l][c];
					System.out.printf(matriz3[l][c] + "\t");
				}
				System.out.println("\n");
			}

			break;
		case 2:
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					matriz3[l][c] = matriz2[l][c] - matriz[l][c];
					System.out.printf(matriz3[l][c] + "\t");
				}
				System.out.println("\n");
			}
			break;
		case 3:
			final double constante = Double
					.parseDouble(JOptionPane.showInputDialog("Digite uma constante para as duas matrizes:"));
			System.out.println("Matriz 1 + constante.\n");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf((matriz[l][c]+constante) + "\t");
				}
				System.out.println("\n");
			}

			System.out.println("Matriz 2 + constante.\n");

			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf((matriz2[l][c]+constante) + "\t");
				}
				System.out.println("\n");
			}

			break;
		case 4:

			System.out.println("Matriz 1\n");
			
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf(matriz[l][c] + "\t");
				}
				System.out.println("\n");
			}

			System.out.println("Matriz 2\n");

			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf(matriz2[l][c] + "\t");
				}
				System.out.println("\n");
			}
			break;
		}

	}

}
