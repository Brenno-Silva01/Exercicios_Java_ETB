package Lista02;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double numero;
        int contador;
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        
        while(contador < 10){
            contador =  (contador + 1);
            
            System.out.println("Digite o " + contador  + "° numero: ");
            numero = scan.nextDouble();
            
            System.out.println("O triplo de " + numero + " é: " + numero*3);    
        }
    }
}
