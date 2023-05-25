package Loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class NotaAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double nota;

        System.out.print("Digite sua nota: ");
        nota = scan.nextDouble();


        while (nota < 0 || nota >10) {

            System.out.print("Nota inválida! Digite novamente: ");

            nota = scan.nextDouble();


        }

    }
}
