import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int soma, num1, num2, num3, num4;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o 1º numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o 2º numero: ");
        num2 = scan.nextInt();
        System.out.println("Digite o 3º numero");
        num3 = scan.nextInt();
        System.out.println("Digite o 4º numero");
        num4 = scan.nextInt();
        
        soma = num1 + num2 + num3 + num4;
        
        System.out.println("O resultado da soma é: " + soma);
    } 
}
