import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double salario, novoSalario;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salário: ");
        salario = scan.nextDouble();
        
        novoSalario = (salario * 0.25) + salario;
        
        System.out.println("O novo salário é de: " + novoSalario);
    }  
}
