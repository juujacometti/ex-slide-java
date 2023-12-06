import java.util.Scanner;

public class exercicio16_vetor8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: [for] A partir de um vetor de inteiros com 8 valores inicializados na declaração apresente a média aritméticas desses valores.


//Criação de variáveis:

        int soma = 0;

//Criação de vetores:

        int [] numeros = new int[] {2, 4, 6, 8, 10, 12, 14, 16};

//Condição de repetição:

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.printf("%d ", soma / numeros.length);
    }
}
