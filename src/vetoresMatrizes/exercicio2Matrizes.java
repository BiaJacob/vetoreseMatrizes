package vetoresMatrizes;

import java.util.Scanner;

public class exercicio2Matrizes {

	public static void main(String[] args) {
		
		double[][] notas = new double[10][4];
        double[] medias = new double[10];
		
		Scanner leia = new Scanner (System.in);
		
		for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = leia.nextDouble();
            }
        }

		for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }
		
		System.out.print("Médias de cada participante: ");
        for (int i = 0; i < medias.length; i++) {
            System.out.print(medias[i] + " ");
            
	}

}
}
