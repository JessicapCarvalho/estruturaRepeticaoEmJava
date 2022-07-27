package Loops;
/*
Faça um programa que leia a tabuada de 1 a 10.

exemplo: tabuada do 5
5x1=5
5x2=10
5x3=15
.....
5x10=50
 */


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {

            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

        }
    }
}