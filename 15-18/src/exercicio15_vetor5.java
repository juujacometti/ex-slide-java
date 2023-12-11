import java.util.Scanner;

public class exercicio15_vetor5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: [for] A partir de um vetor de inteiros com 5 valores inicializados na declaração apresente o dobro de cada valor armazenado.

//Criação de vetores:

        int [] numeros = new int[] {5, 10, 15, 20, 25};

//Condção de repetição:

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i] * 2);
        }
    }
}