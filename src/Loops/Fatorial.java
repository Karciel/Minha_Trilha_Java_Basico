package Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número que desejas saber o fatorial: ");
        int fatorial = scan.nextInt();

        int resultado = 1;

        for (int i = fatorial; i >=1; i--) {

            resultado *= i;

        }
        System.out.println("O fatorial de " + fatorial + " é " + resultado);

        scan.close();
    }
}