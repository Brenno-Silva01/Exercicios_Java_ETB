import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double media, num1, num2, num3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o 1º numero");
        num1 = scan.nextDouble();
        System.out.println("Digite o 2º numero");
        num2 = scan.nextDouble();
        System.out.println("Digite o 3º numero");
        num3 = scan.nextDouble();
        
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("O resultado da média é: " + media);
    }   
}
