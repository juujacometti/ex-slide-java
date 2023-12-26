import java.util.Scanner;

public class exercicio24_VetorXYZ {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Declare os vetores X {50, 70, 30, 60, 100} e Y {90, 50, 100, 30, 80}. Carregue e apresente um vetor Z com os valores que constam simultaneamente nos vetores X e Y.

// Vetor:

        int[] vetX = new int[]{50, 70, 30, 60, 100};
        int[] vetY = new int[]{90, 50, 100, 30, 80};
        int[] vetZ = new int[3];

// Looping de informação p usuário:

        System.out.println("1º Quadro de números: ");
        for(int i = 0; i < vetX.length; i++) {
            System.out.println(vetX[i]);
        }

        System.out.println("\n2º Quadro de números: ");
        for(int i = 0; i < vetY.length; i++) {
            System.out.println(vetY[i]);
        }

// Looping Z:

        int contador = 0;

        for(int i = 0; i < vetX.length; i++) {

            for (int b = 0; b < vetY.length; b++) {

                if (vetX[i] == vetY[b]) {
                    vetZ[contador++] = vetX[i];
                }
            }
        }

// Execução:

        System.out.println("\nOs números que aparecem simultaneamente nos dois quadros de números são: ");
        for(int i = 0; i < vetZ.length; i++) {
            System.out.println(vetZ[i]);
        }

    }
}
