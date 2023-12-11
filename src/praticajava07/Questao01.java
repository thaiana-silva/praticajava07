package praticajava07;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in)) {
			 int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		        
		        System.out.println("vetor:");
		        for (int indice = 0; indice < vetor.length; indice++) {
		            System.out.println(vetor[indice]);
		        }
		        
		        System.out.print("\nDigite o número que você deseja encontrar: ");
		        int numProcurado = leia.nextInt();
		        
		        boolean numEncontrado = false;
		        int posicao = -1;
		        
		        for (int indice = 0; indice < vetor.length; indice++) {
		            if (vetor[indice] == numProcurado) {
		                numEncontrado = true;
		                posicao = indice;
		                break;
		            }
		        }
		        
		        if (numEncontrado) {
		            System.out.println("\nO número " + numProcurado + " está localizado na posição: " + posicao);
		        } else {
		            System.out.println("\nO número " + numProcurado + " não foi encontrado!");
		        }
		}
	}
}