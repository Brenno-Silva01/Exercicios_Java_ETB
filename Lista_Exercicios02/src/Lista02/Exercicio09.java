package Lista02;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int numCandidato, totalVotos, votosCandidato45, votosCandidato13;
        
        Scanner scan = new Scanner(System.in);
        
        votosCandidato45 = 0;
        votosCandidato13 = 0;
        
        do{
            System.out.println("Digite o Numero do candidato que deseja vota: ");
            numCandidato = scan.nextInt();
            
            if((numCandidato != 45) && (numCandidato != 13) && ((numCandidato != 0))){
                System.err.println("NUMERO INVÁLIDO! ESCOLHA ENTRE O CANDIDATO 45 OU 13");
            }
            
            if(numCandidato == 45){
                votosCandidato45++;
            }
            
            if(numCandidato == 13){
                votosCandidato13++;
            }
            
        }while(numCandidato != 0);
        
        totalVotos = votosCandidato13 + votosCandidato45;
        
        System.out.println("Votos obtidos pelo candidato 45: " + votosCandidato45);
        System.out.println("Votos obtidos pelo candidato 13: " + votosCandidato13);
        System.out.println("Total de votos: " + totalVotos);
    }   
}
