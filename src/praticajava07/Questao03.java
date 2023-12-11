package praticajava07;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] matriz = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        System.out.println("Matriz:");
		        for (int indiceLinha= 0; indiceLinha< 3; indiceLinha++) {
		            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
		                System.out.print(matriz[indiceLinha][indiceColuna] + " ");
		            }
		            System.out.println();
		        }

		        int somaDiagonalPrincipal = 0;
		        int somaDiagonalSecundaria = 0;
		        
		        System.out.println("\nElementos da Diagonal Principal:");
		        for (int indiceLinha= 0; indiceLinha< 3; indiceLinha++) {
		            System.out.print(matriz[indiceLinha][indiceLinha] + " ");
		            somaDiagonalPrincipal += matriz[indiceLinha][indiceLinha];
		        }

		        System.out.println("\nElementos da Diagonal Secundária:");
		        for (int indiceLinha= 0, indiceColuna = 2; indiceLinha < 3 && indiceColuna >=0; indiceLinha++, indiceColuna--) {
		            System.out.print(matriz[indiceLinha][indiceColuna] + " ");
		            somaDiagonalSecundaria += matriz[indiceLinha][indiceColuna];
		        }

		        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
		    }
		}
