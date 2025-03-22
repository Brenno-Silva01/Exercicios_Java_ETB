package Lista01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        int anoNascimento, anoAtual, idadeAtual, idadeFutura;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu: ");
        anoNascimento = scan.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = scan.nextInt();

        idadeAtual = anoAtual - anoNascimento;
        idadeFutura = 2080 - anoNascimento;

        System.out.println("Sua idade atual é: " + idadeAtual);
        System.out.println("Sua idade no ano de 2080 será: " + idadeFutura);

    }
}
