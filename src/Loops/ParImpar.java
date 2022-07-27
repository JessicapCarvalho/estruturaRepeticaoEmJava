package Loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPar = 0 , quantImpar = 0;

        System.out.println("Quantidade de numeros que quer digitar: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;
            else quantImpar++;

           // count = count +1;
            count++;

        }while (count < quantNumeros);

        System.out.println("Quantidade de Pares: " + quantPar);
        System.out.println("Quantidade de Impares: " + quantImpar);

    }
}
