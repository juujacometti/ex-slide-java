import java.util.Scanner;

public class exercicio26_mtz7x2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// OBJETIVO: Preencha uma matriz de 7x2 com valores referentes a temperaturas mínimas e máximas de uma semana e apresente os valores como solicitado no slide.

// Matriz:

        int[][] temp = new int[7][2];

        for(int linha = 0; linha < 7; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                System.out.printf("Digite a temperatura (posição: %d,%d): ", linha, coluna);
                temp[linha][coluna] = leia.nextInt();
            }
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i][0] > temp[i][1]){
                System.out.println("Dia " + (i + 1) + " Mínima: " + temp[i][1] + " Máxima: " + temp[i][0]);
            }
            else{
                System.out.println("Dia " + (i + 1) + " Mínima: " + temp[i][0] + " Máxima: " + temp[i][1]);
            }
        }
    }
}
