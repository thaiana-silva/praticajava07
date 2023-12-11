package praticajava07;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			int[] vetor = new int[10];

			System.out.println("Digite 10 números inteiros:");
			for (int indice = 0; indice < 10; indice++) {
			    vetor[indice] = leia.nextInt();
			}

			System.out.println("\nElementos nos índices ímpares:");
			for (int indice = 1; indice < 10; indice += 2) {
			    System.out.print(vetor[indice] + " ");
			}

			System.out.println("\n\nElementos pares:");
			for (int indice = 0; indice < 10; indice++) {
			    if (vetor[indice] % 2 == 0) {
			        System.out.print(vetor[indice] + " ");
			    }
			}

			int soma = 0;
			for (int indice = 0; indice < 10; indice++) {
			    soma += vetor[indice];
			}

			double media = (double) soma / 10;

			System.out.println("\n\nSoma: " + soma);
			System.out.printf("Média: %.2f\n", media);
		}
	}

}
