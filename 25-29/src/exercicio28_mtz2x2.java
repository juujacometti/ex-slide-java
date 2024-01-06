import javax.swing.*;
import java.util.Scanner;

public class exercicio28_mtz2x2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Preencha uma matriz de 2x2 com números inteiros informados pelo usuário e apresente o maior número e sua posição.

// Variável:

        int maior = 0;

// Matriz:

        int[][] numero = new int[2][2];

// Looping:

        for(int l = 0; l < numero.length; l++) {
            for(int c = 0; c < numero.length; c++) {
                System.out.println("Digite um número inteiro: ");
                numero[l][c] = leia.nextInt();

            }
        }

        for(int l = 0; l < numero.length; l++) {
            for(int c = 0; c < numero.length; c++) {
                if(numero[l][c] > maior) {
                    maior = numero[l][c];
                }
            }
        }

        for(int l = 0; l < numero.length; l++) {
            for (int c = 0; c < numero.length; c++) {
                if (numero[l][c] == maior) {
                    System.out.println("O maior número digitado foi: " + maior + "\nA posição do número maior é: " + (l + 1) + "," + (c + 1));
                }
            }
        }

    }
}
