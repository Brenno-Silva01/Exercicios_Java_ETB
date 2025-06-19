package exercicio03L05;

public class Main {
    public static void main (String[] args){

        int soma = Estatico.somarTresValores(10, 20, 5);
        System.out.println("O resultado da soma é: " + soma);

        String saudacao = Estatico.saudacao("Brenno");
        System.out.println(saudacao);

        // Outros exemplos
        System.out.println("A soma de 1, 2 e 3 é: " + Estatico.somarTresValores(1, 2, 3));
        System.out.println(Estatico.saudacao("Desenvolvedor"));
    }
}
