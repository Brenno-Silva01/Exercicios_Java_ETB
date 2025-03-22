package Lista01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        double deposito, taxaJuros, rendimento, valorTotal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do depósito: ");
        deposito = scan.nextDouble();
        System.out.println("Digite o valor da taxa de juros: ");
        taxaJuros = scan.nextDouble();

        rendimento = deposito * (taxaJuros/100);
        valorTotal = deposito + rendimento;

        System.out.println("O rendimento final foi de: " + rendimento);
        System.out.println("O valor total após o rendimento é de: " + valorTotal);

    }
}
