import java.util.Scanner;

public class exercicio22_vetorAeB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Programa que leia 6 números inteiros e armazene em um vetor A. Carregue um vetor B (de mesmo tipo e tamanho) com a metade dos valores armazenados em A. Apresente os valores dos dois vetores.

// Vetor:

        double[] vetA = new double[6];
        double[] vetB = new double[6];

// Looping A:

        for(int i = 0; i < vetA.length; i++) {
            System.out.println("Digite um número inteiro aleatório: ");
            vetA[i] = leia.nextInt();
        }

// Looping B:

        for(int i = 0; i < 6; i++) {
            vetB[i] = vetA[i] / 2;
        }

// Execução:

        System.out.println("Os números que você escolheu foram:");
        for(int i = 0; i < 6; i++) {
            System.out.println(vetA[i]);
        }

        System.out.println("A metade de cada número escolhido é:");
        for(int i = 0; i < 6; i++) {
            System.out.println(vetB[i]);
        }
    }
}
