import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double num1, num2, num3, media;
        double peso1, peso2, peso3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a 1º nota: ");
        num1 = scan.nextDouble();
        System.out.println("Digite o peso da 1º nota: ");
        peso1 = scan.nextDouble();
        System.out.println("Digite a 2º nota: ");
        num2 = scan.nextDouble();
        System.out.println("Digite o peso da 2º nota: ");
        peso2 = scan.nextDouble();
        System.out.println("Digite a 3º nota: ");
        num3 = scan.nextDouble();
        System.out.println("Digite o peso da 3º nota: ");
        peso3 = scan.nextDouble();
        
        media = ((num1 * peso1) + (num2 * peso2) + (num3 * peso3)) / (peso1 + peso2 + peso3);
        
        System.out.println("O valor da média ponderada é: " + media);
    }
}
