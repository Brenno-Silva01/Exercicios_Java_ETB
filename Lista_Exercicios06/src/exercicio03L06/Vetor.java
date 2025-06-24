package exercicio03L06;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Vetor de 10 posições

        // Loop para preencher o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print( (i+1) + " - Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\n--- Lista dos Números Digitados ---");
        // Loop para imprimir os números do vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
