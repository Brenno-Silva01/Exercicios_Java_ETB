import java.util.Scanner;

public class Exercicio04_Switch {
    public static void main(String[] args) {
        double salario, novoSalario, diferencaSalario;
        int codigoCargo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o o salário: ");
        salario = scan.nextDouble();
        System.out.println("Digite o código do cargo do funcionário: ");
        codigoCargo = scan.nextInt();
        
        switch (codigoCargo){
            case 101:
                novoSalario = salario + (salario * 0.1);
                diferencaSalario = novoSalario - salario;
                System.out.println("O valor do salário antigo é: " + salario);
                System.out.println("O valor do novo salário é: " + novoSalario);
                System.out.println("O valor do novo salário é: " + diferencaSalario);
                break;
            case 102:
                novoSalario = salario + (salario * 0.2);
                diferencaSalario = novoSalario - salario;
                System.out.println("O valor do salário antigo é: " + salario);
                System.out.println("O valor do novo salário é: " + novoSalario);
                System.out.println("O valor do novo salário é: " + diferencaSalario);
                break;
            case 103:
                novoSalario = salario + (salario * 0.3);
                diferencaSalario = novoSalario - salario;
                System.out.println("O valor do salário antigo é: " + salario);
                System.out.println("O valor do novo salário é: " + novoSalario);
                System.out.println("O valor do novo salário é: " + diferencaSalario);
                break;
            default:
                novoSalario = salario + (salario * 0.4);
                diferencaSalario = novoSalario - salario;
                System.out.println("O valor do salário antigo é: " + salario);
                System.out.println("O valor do novo salário é: " + novoSalario);
                System.out.println("O valor do novo salário é: " + diferencaSalario);
        }  
    }    
}
