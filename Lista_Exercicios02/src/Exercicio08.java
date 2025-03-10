import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int contador, idade,somaIdade, qtdIdadeMenorVinte, qtdPesoMaiorSetenta;
        double peso, altura, somaAltura, mediaIdade, mediaAltura, porcentagemPesoMaiorSetenta;
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        qtdIdadeMenorVinte = 0;
        qtdPesoMaiorSetenta = 0;
        somaIdade = 0;
        somaAltura = 0;
        
        while(contador < 11){
            contador =  (contador + 1);
            
            System.out.println("Digite as informações do " + contador  + "° jogador: ");
            System.out.println("Digite o PESO: ");
            peso = scan.nextDouble();
            System.out.println("Digite a IDADE: ");
            idade = scan.nextInt();
            System.out.println("Digite a ALTURA");
            altura = scan.nextDouble();
            
            if(idade < 20 ){
                qtdIdadeMenorVinte++;
                somaAltura = somaAltura + altura;
            }
            
            if(peso > 70){
                qtdPesoMaiorSetenta++;  
            }
            
            somaIdade = somaIdade + idade;
           
        }
        
        mediaIdade = somaIdade / 11;
        mediaAltura = somaAltura / qtdIdadeMenorVinte;
        porcentagemPesoMaiorSetenta = ((double)qtdPesoMaiorSetenta / 11) * 100;
        
        System.out.println("A quantidade de jogadores com idade inferior a 20 anos é: " + qtdIdadeMenorVinte);
        System.out.println("A média de idade do time é: " + mediaIdade);
        System.out.println("A média das alturas dos jogadores com menos de 20 anos é: " + mediaAltura);
        System.out.println("A porcentagem de jogadores com mais de 70kg é: " + porcentagemPesoMaiorSetenta + "%");
    }  
}
