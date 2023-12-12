import java.util.Scanner;

public class exercicio19_vetor8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: Programa que leia 8 números (entre 100 e 200). Caso não esteja, apresente uma mensagem de “valor inválido”. Depois de preenchido, apresente os valores armazenados.

//Criação de vetor:

        int[] numero = new int[8];

//Criação de looping:

        for(int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número entre 100 e 200: ");
            numero[i] = leia.nextInt();

            if (numero[i] < 100 || numero[i] > 200) {
                System.out.println("Valor inválido!");
                return;
            }

        }

        System.out.println("Os número digitados foram: ");
        for(int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

    }
}




