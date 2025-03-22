package Lista02;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double numero1, numero2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° numero: ");
        numero1 = scan.nextDouble();
        System.out.println("Digite o 2° numero: ");
        numero2 = scan.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " é o maior entre os dois");
        } else {
            System.out.println("O numero " + numero2 + " é o maior entre os dois");
        }
    }
}
