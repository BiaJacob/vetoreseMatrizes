package vetoresMatrizes;

import java.util.Scanner;

public class exercicio1Matrizes {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = leia.nextInt();
            }
        }
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elementos da diagonal secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
    }

		

}


