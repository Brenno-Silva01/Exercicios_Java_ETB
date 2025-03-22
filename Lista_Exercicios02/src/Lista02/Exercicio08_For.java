package Lista02;
import java.util.Scanner;

public class Exercicio08_For {
    public static void main(String[] args) {
        int i, contador, idade,somaIdade, qtdIdadeMenorVinte, qtdPesoMaiorSetenta;
        double peso, altura, somaAltura, mediaIdade, mediaAltura, porcentagemPesoMaiorSetenta;
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        qtdIdadeMenorVinte = 0;
        qtdPesoMaiorSetenta = 0;
        somaIdade = 0;
        somaAltura = 0;
        
        for(i= 0; i < 11; i++){
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
