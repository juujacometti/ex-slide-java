import java.util.Scanner;

public class exercicio23_VetorABC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Programa que leia 5 números inteiros e armazene em um vetor A. Leia 5 números inteiros e armazene em um vetor B. Carregue e apresente um vetor C com os valores de A e B alternados.

// Vetor:

        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[10];

// Looping A:

        System.out.println("Você precisa escolher 5 números.");
        for(int i = 0; i < vetA.length; i++) {
            System.out.println("Informe um número inteiro aleátorio: ");
            vetA[i] = leia.nextInt();
        }

// Looping B:

        System.out.println("\nAgora, você precisa escolher outros 5 números.");
        for(int i = 0; i < vetB.length; i++) {
            System.out.println("Informe um número inteiro aleátorio: ");
            vetB[i] = leia.nextInt();
        }


// Looping C:

        int contador = 0;
        for(int i = 0; i < 5; i++) {
            vetC[contador++] = vetA[i];
            vetC[contador++] = vetB[i];
        }

// Execução:

        System.out.println("Os números que você escolheu, de forma alternada, ficam: ");
        for(int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i]);
        }


    }
}
