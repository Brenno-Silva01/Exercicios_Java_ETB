import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double salario, novoSalario;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        salario = scan.nextDouble();
        
        if (salario >= 1000) {
            novoSalario = salario + 100;
            System.out.println("Seu salário com bônus é de: " + novoSalario);
        } else {
            novoSalario = salario + 50;
            System.out.println("Seu salário com bônus é de: " + novoSalario);
        }   
    }   
}
