package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os  na ordem inversa.
 */

public class ordemInversa {
    public static void main(String[] args) {
        //variavel do vetor
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //imprime ordem do vetor
        System.out.println("Vetor: ");

        //count é uma variavel contador
        int count = 0;

        //laço de repetição While
        while (count <= (vetor.length - 1)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        //imprime segunda linha (\n = quebra de linha)
        System.out.println("\nVetor");

        //Laço de repetição for
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }
    }
}