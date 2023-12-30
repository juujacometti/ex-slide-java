import java.util.Scanner;

public class exercicio_mtz4x2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Preencha uma matriz de 4x2 com valores reais (double) e apresente a soma dos valorescontidos em cada linha.

// Matriz:

        double[][] pos = new double[4][2];

        for(int l = 0; l < pos.length; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.printf("Digite o " + (l + 1) + " número: (posição: %d,%d): ", l, c);
                pos[l][c] = leia.nextDouble();
            }
        }

        for (int l = 0; l < pos.length; l ++) {
            for(int c = 0; c < 2; c++){
                System.out.printf("%.1f + %.1f = %.1f \n", pos[l][0], pos[l][1], (pos[l][0] + pos[l][1]));
            }
        }
    }
}
