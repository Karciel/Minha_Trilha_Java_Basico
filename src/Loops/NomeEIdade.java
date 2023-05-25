package Loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.print("Digite seu nome: ");
            nome = scan.next();
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade == 0) {
                System.out.println("Programa encerrado!");
                break;
            }
            System.out.println(nome + " tem " + idade + " anos");
        }

        scan.close();

    }

}
