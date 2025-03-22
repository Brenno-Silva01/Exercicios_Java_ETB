package Lista01;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double salarioBase, salarioReceber, salarioImposto;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu salário base: ");
        salarioBase = scan.nextDouble();
        
        salarioImposto =  salarioBase - (salarioBase * 0.1);
        salarioReceber = salarioImposto + 50;
        
        System.out.println("Seu salário final é: " + salarioReceber);
               
    } 
}