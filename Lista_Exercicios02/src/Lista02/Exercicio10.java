package Lista02;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int matricula, idade, estadoCivil, qtdCasada, qtdSolteira, somaIdadeViuvo, qtdViuvo;
        int idadeMaisVelho, idadeMaisNova, matriculaIdadeMaisNova, qtdDesquitada, contador;
        double mediaIdadeViuvo, porcentagemDesquitada;
       
        Scanner scan = new Scanner(System.in);
       
        qtdCasada = 0;
        qtdSolteira = 0;
        somaIdadeViuvo = 0;
        qtdViuvo = 0;
        idadeMaisVelho = 0;
        idadeMaisNova = 120;
        qtdDesquitada = 0;
        contador = 0;
        matriculaIdadeMaisNova = -1;
       
        while(true){
            System.out.println("DIGITE OS DADOS DO FUNCIONÁRIO");
            System.out.println("Digite a Matricula: ");
            matricula = scan.nextInt();
           
            if(matricula < 0){
                break;

            }
           
            System.out.println("Digite a Idade: ");
            idade = scan.nextInt();
            System.out.println("Digite o Estado Civil: ");
            System.out.println("1 = Casado");
            System.out.println("2 = Solteiro");
            System.out.println("3 = Viúvo");
            System.out.println("4 = Desquitado");
            estadoCivil = scan.nextInt();
           
            while (estadoCivil < 1 || estadoCivil > 4) {
                System.err.println("Estado Civil inválido. Digite novamente: ");
                estadoCivil = scan.nextInt();
            }
           
            contador++;
           
            if(estadoCivil == 1){
                qtdCasada++;
            }
           
            if(estadoCivil == 2 && (idade >= 20 && idade <= 30)){
                qtdSolteira++;
            }
       
            if(estadoCivil == 3){
                qtdViuvo++;
                somaIdadeViuvo = somaIdadeViuvo + idade;
            }
           
            if(idade > idadeMaisVelho){
                idadeMaisVelho = idade;
            }
           
            if(idade < idadeMaisNova){
                matriculaIdadeMaisNova = matricula;
            }
           
            if(estadoCivil == 4){
                qtdDesquitada++;
            }
           
        }
       
        if(qtdViuvo > 0){
            mediaIdadeViuvo = (double) somaIdadeViuvo / qtdViuvo;
        }else{
            mediaIdadeViuvo = 0;
        }
   
        porcentagemDesquitada = ((double) qtdDesquitada / contador)*100;
       
        System.out.println("A quantidade de pessoas casadas é: " + qtdCasada);
        System.out.println("A quantidade de pessoas solteiras com idade entre 20 e 30 anos é: " + qtdSolteira);
        System.out.println("A média de idade das pessoas viúvas é: " + mediaIdadeViuvo);
        System.out.println("A porcentagem de pessoas desquitadas dentre todas as pessoas analisadas é: " + porcentagemDesquitada);
        System.out.println("A idade da pessoa mais velha é: " + idadeMaisVelho);
        System.out.println("A matrícula da pessoa mais nova é: " + matriculaIdadeMaisNova);
    }
}
