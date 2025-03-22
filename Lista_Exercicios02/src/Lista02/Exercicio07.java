package Lista02;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double nota, somaTotal, media;
        int contador;
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        somaTotal = 0;
        
        while(contador < 13){
            contador =  (contador + 1);
            
            System.out.println("Digite a " + contador  + "° nota: ");
            nota = scan.nextDouble();
            
            somaTotal = somaTotal + nota;
        }
        
        media = somaTotal / 13;
        
        System.out.println("A média de todas as notas é: " + media);
    }   
}
