import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        double valorCarroNovo, precoFabrica, percentualDistribuidor,
                lucroDistribuidor, percentualImpostos, impostosFinal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço de fábrica do veículo: ");
        precoFabrica = scan.nextDouble();
        System.out.println("Digite o percentual de lucro dos distribuidores: ");
        percentualDistribuidor = scan.nextDouble();
        System.out.println("Digite o percentual dos impostos: ");
        percentualImpostos = scan.nextDouble();

        lucroDistribuidor = precoFabrica * (percentualDistribuidor/100);
        impostosFinal = precoFabrica * (percentualImpostos/100);
        valorCarroNovo = precoFabrica + lucroDistribuidor + impostosFinal;

        System.out.println("O lucro do distribuidor é de: " + lucroDistribuidor);
        System.out.println("O valor pago de impostos é de: " + impostosFinal);
        System.out.println("O valor final da venda do veículo é de: " + valorCarroNovo);
    }
}
