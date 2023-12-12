import java.util.Scanner;

public class exexrcicio20_VetStng10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//OBJETIVO: A partir de um vetor de Strings com 10 nomes inicializados, leia um novo nome e verifique se ele está armazenado no vetor, se estiver, apresenta a posição onde ele está, caso contrário, apresente a mensagem “Nome não encontrado!”


//Váriáveis:

        String nomeDig;

//Criação de vetor:

        String[] nomes = new String[10];

// Atribuição de valores no vetor:

        nomes[0] = "Julya";
        nomes[1] = "Caio";
        nomes[2] = "Ana";
        nomes[3] = "Bia";
        nomes[4] = "Jaque";
        nomes[5] = "Flor";
        nomes[6] = "Marco";
        nomes[7] = "Guto";
        nomes[8] = "Leo";
        nomes[9] = "Vini";

//Criação de v ou f:

       // boolean nomeEnc = false;

//Solicitação p usuário:

        System.out.println("Digite o nome que você deseja saber a posição: ");
        nomeDig = leia.nextLine();

//Criação de looping e condição:

        for(int i = 0; i < nomes.length; i++) {
            if (nomeDig.equals(nomes[i])) {
                System.out.println("O nome procurado encontra-se na posição: " + i);
               // nomeEnc = true;
                return;
            }
        }

        System.out.println("Nome não encontrado!");

    }
}

