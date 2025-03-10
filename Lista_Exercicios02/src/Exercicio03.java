import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double numero1, numero2, media, multiplicacao, divisao, maior, diferenca, menor;
        byte escolha;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o 1° numero");
        numero1 = scan.nextDouble();
        System.out.println("Digite o 2° numero");
        numero2 = scan.nextDouble();
        
        System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO");
        System.out.println("Digite um numero de acordo com as opções");
        System.out.println("1 – Média entre os números digitados\n" +
        "2 – Produto (multiplicação) entre os números digitados\n" +
        "3 – Divisão do primeiro pelo segundo\n" +
        "4 – Diferença do maior pelo menor");
        escolha = scan.nextByte();
        
        switch (escolha){
            case 1: 
                media = (numero1 + numero2) / 2; 
                System.out.println("A média dos dois numeros é: " + media); break;
            case 2: 
                multiplicacao = (numero1 * numero2); 
                System.out.println("O resultado da multiplicação dos dois numeros é: " + multiplicacao); break;
            case 3: 
               divisao = (numero1 / numero2); 
               System.out.println("A divisão do primeiro numero pelo segundo é: " + divisao); break;
            case 4:
                if (numero1 > numero2){
                    maior = numero1;
                    menor = numero2;
                } else {
                    maior = numero2;
                    menor = numero1;
                }
                diferenca = maior - menor;
                System.out.println("A diferença do maior numero pelo menor é de: " + diferenca); break;
            default: 
                System.err.println("NUMERO INSERIDO INVÁLIDO, DIGITE UM NUMERO DE 1 A 4.");
        }
    }    
}
