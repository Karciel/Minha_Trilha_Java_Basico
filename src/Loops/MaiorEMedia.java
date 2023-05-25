package Loops;

import java.util.Scanner;

/*

Faça um programa que leia 5 números e informe o maior número e a média desses números

*/

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int maior = 0;
        int soma = 0;
        int num;


        int count = 0;

        do {
            System.out.print("Digite um valor: ");
            num = scan.nextInt();
            count++;

            soma = soma + num;

            if (num > maior) {
                maior = num;
            }


        } while(count < 5);

        System.out.println("O maior número é "+ maior);
        System.out.println("A média dos números é "+ soma/5);


        scan.close();

    }


}
