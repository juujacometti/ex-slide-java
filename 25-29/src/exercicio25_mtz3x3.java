import java.util.Scanner;

public class exercicio25_mtz3x3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Preencha uma matriz de 3x3 com números inteiros informados pelo usuário e apresente os valores armazenados como uma tabela 3x3.

// Matriz:

        int[][] numero = new int[3][3];

// Looping:

        for(int linha = 0; linha < numero.length; linha++) {

            for(int coluna = 0; coluna < numero.length; coluna++) {
                System.out.println("Insira aqui os números que você deseja inserir na tabela: ");
                numero[linha][coluna] = leia.nextInt();

            }
        }

// Execução:

        System.out.println("Esses são os números escohidos: ");
        for(int linha = 0; linha < numero.length; linha++) {
            for (int coluna = 0; coluna < numero.length; coluna++) {
                System.out.print(numero[linha][coluna] + " ");

            }

            System.out.println();

        }

    }
}