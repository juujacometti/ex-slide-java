import java.util.Scanner;

public class exercicio29_mtz3x3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Declare uma matriz A de 3x3 inicializada com valores inteiros e preencha uma matriz B (de mesma dimensão e tipo) com o dobro dos valores na posições equivalentes (por exemplo: A[2,2] = 10 → B[2,2] = 20) e apresente os valores das duas matrizes

// Matriz:

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

// Looping:

        for(int l = 0; l < a.length; l++) {
            for(int c = 0; c < a.length; c++) {
                System.out.println("Digite um número inteiro aleatório: ");
                a[l][c] = leia.nextInt();
            }
        }

        System.out.println("Os números que você escolheu foram: ");
        for(int l = 0; l < a.length; l++) {
            for (int c = 0; c < a.length; c++) {
                System.out.println(a[l][c] + " = " + "[" + (l + 1) + "," + (c + 1) + "]");
                b[l][c] = a[l][c] * 2;
            }
        }

        System.out.println("\nO dobro dos números escolhidos são: ");
        for(int l = 0; l < a.length; l++) {
            for(int c = 0; c < b.length; c++) {
                System.out.println(b[l][c] + " = " + "[" + (l + 1) + "," + (c + 1) + "]");
            }
        }

    }
}
