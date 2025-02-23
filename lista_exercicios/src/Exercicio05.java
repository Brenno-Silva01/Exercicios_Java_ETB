import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double salario, porcentagem, novoSalario;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salário: ");
        salario = scan.nextDouble();
        System.out.println("Digite a porcentagem de aumento: ");
        porcentagem = scan.nextDouble();
        
        novoSalario = (salario * (porcentagem/100) + salario);
        
        System.out.println("O novo salário é: " + novoSalario);
    }
    
}
