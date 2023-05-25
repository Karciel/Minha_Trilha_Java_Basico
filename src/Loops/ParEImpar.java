package Loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numeros;
        int quantpar = 0;
        int quantimpar = 0;


        int count = 0;
        do {
            System.out.print("Digite um valor: ");
            numeros = scan.nextInt();

            if (numeros % 2 == 0) {
                quantpar++;

            } else {
                quantimpar++;
            }

            count++;


        }while(count < 5);

        System.out.println("A quantidade de números pares: "+ quantpar);
        System.out.println("A quantidade de números impares: "+ quantimpar);

        scan.close();
    }

}
