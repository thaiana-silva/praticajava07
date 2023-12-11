package praticajava07;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int participantes = 10;
        int bimestres = 4;
        
        double[][] notas = {
            {4.0, 5.0, 7.0, 3.0},
            {2.5, 6.5, 4.7, 8.0},
            {10.0, 8.5, 9.5, 8.0},
            {9.0, 6.5, 7.6, 8.2},
            {5.0, 5.0, 5.0, 6.3},
            {7.0, 8.0, 9.0, 8.5},
            {5.5, 3.5, 2.5, 1.0},
            {8.0, 9.0, 10.0, 9.5},
            {5.6, 5.8, 6.5, 7.0},
            {7.5, 8.5, 9.5, 10.0}
        };

        double[] medias = new double[participantes];
        for (int linha = 0; linha< participantes; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < bimestres; coluna++) {
                soma += notas[linha][coluna];
            }
            medias[linha] = soma / bimestres;
        }

        System.out.println("Notas dos participantes:");
        for (int linha= 0; linha< participantes; linha++) {
            for (int coluna = 0; coluna < bimestres; coluna++) {
                System.out.print(notas[linha][coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMédias dos participantes:");
        for (int linha= 0; linha< participantes; linha++) {
            System.out.printf("%.1f ", medias[linha]);
        }
    }
}