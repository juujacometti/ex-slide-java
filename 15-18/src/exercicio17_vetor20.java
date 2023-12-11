import java.util.Scanner;

public class exercicio17_vetor20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: [for] Programa que leia a idade de 20 pessoas e apresente as idades acima da média.

//Criação de variávies:

        int soma = 0;
        double media = 0;

//Criação de vetores:

        int[] idades = new int[20];

//Criação de repetição:

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade de 20 pessoas: ");
            idades[i] = leia.nextInt();
            soma += idades[i];
        }

//Operação:

        media = ((double) soma / idades.length);

//Execução:

        System.out.println("A media das idades digitadas é: " + media);
        System.out.println("As idades acima da média são: ");

        for (int i = 0; i <= idades.length; i++) {

            if (idades[i] > media) {
                System.out.println(idades[i]);
            }

        }
    }
}