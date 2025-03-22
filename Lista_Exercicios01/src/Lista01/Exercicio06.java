package Lista01;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double salario, salarioGratificacao, salarioImposto;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu salário");
        salario = scan.nextDouble();
        
        salarioGratificacao = (salario + (salario * 0.05));
        salarioImposto = (salarioGratificacao  - (salarioGratificacao * 0.07));
        
        
        System.out.println("Seu salário final é: " + salarioImposto);
    }
}
