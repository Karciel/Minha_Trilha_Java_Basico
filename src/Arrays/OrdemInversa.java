package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 3, 6, 8, 2, 7};

        //System.out.println(vetor.length);

        System.out.println("Vetor: ");

        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count++] + " ");
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length -1); i >= 0; i-- ) {
            System.out.print(vetor[i] + " ");
        }

    }
}