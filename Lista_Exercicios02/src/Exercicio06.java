import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero, i, somaTotal;
        
        Scanner scan = new Scanner(System.in);
        
        somaTotal = 0;
     
        for(i=1; i <= 12; i++){
            System.out.println("Digite o " + i + "° numero: ");
            numero = scan.nextInt();
            
            somaTotal = somaTotal + numero;
        }
        
        System.out.println("A soma de todos os numeros digitados é: " + somaTotal);
    }  
}
