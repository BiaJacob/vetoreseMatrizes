package vetoresMatrizes;

import java.util.Scanner;

public class exercicio2Vetores {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		double media;
		
		for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("Elementos dos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Elementos pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);

       media = (double) soma / vetor.length;
        System.out.println("Média: " + media);
		
	}

}
