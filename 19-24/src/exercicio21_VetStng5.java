import java.util.Scanner;

public class exercicio21_VetStng5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Desenvolva uma nova versão do programa anterior em que o usuário terá a quantidade de tentativas limitada a 5. Caso o nome seja encontrado apresente a posição (índice) onde ele está e em qual tentativa ele foi encontrado.


// Variáveis:

        String busca;

// Criação de vetor:

        String[] nome = new String[10];

// Atribuição de valores no vetor:

        nome[0] = "Julya";
        nome[1] = "Bia";
        nome[2] = "Ana";
        nome[3] = "Jaque";
        nome[4] = "Caio";
        nome[5] = "Flor";
        nome[6] = "Duda";
        nome[7] = "Maya";
        nome[8] = "Sofia";
        nome[9] = "Pedro";

// Solicitação p usuário (nome):

        System.out.println("Digite aqui o nome que deseja encontrar: ");
        busca = leia.nextLine();

// Criação de looping:

        for (int tentativa = 1; tentativa <= 5; tentativa++) {

            for (int i = 0; i < nome.length; i++) {
                if (busca.equals(nome[i])) {
                    System.out.println("O nome que você procura está na posição: " + i + "\nVocê usou " + tentativa + " tentativa(s)!");
                    return;
                }
                else {
                    while (tentativa <= 5){
                        System.out.println("O nome não foi encontrado na tentativa: " + tentativa + ", tente novamente");
                        tentativa++;
                    }
                }
            }
        }

        System.out.println("Você utilizou todas as 5 tentativas! O programa será encerrado.");

    }

}


