import java.util.Scanner;

public class exercicio18_vetor10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: [for] Programa que leia 10 números e apresente os valores pares. Caso não tenha nenhum número par, apresente a mensagem “Todos os números são ímpares.”

//Criação de vetores:

        int [] numero = new int[10];

//Criação de looping:

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número aleatório: ");
            numero[i] = leia.nextInt();
        }

        boolean par = false;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                par = true;
            }
        }

        if (par == true) {
            System.out.println("Os números pares são: ");
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] % 2 == 0) {
                    System.out.println(numero[i]);
                }
            }

            return;
        }

        System.out.println("Todos os números são ímpares!");

    }
}
