package exercicio04L06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Exibir mensagem inicial (método estático)
        Brinquedo.mensagemLoja();

        // Exibir data e hora da execução (Uso da classe SimpleDateFormat)
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data/Hora da execução: " + sdf.format(hoje));
        System.out.println();

        // Polimorfismo com um array de Brinquedo
        Brinquedo[] brinquedos = new Brinquedo[4];
        brinquedos[0] = new Passeio("Carrinho de Passeio", 150.0, 100.0, 12.5, 4);
        brinquedos[1] = new Utilitarios("Caminhão de Brinquedo", 300.0, 80.0, 10.0, 6);
        brinquedos[2] = new Comercial("Avião Comercial", 500.0, 35.0, 2021, 150);
        brinquedos[3] = new Militar("Caça Militar", 800.0, 20.0, 2022, "Mísseis");

        // Uso da classe DecimalFormat
        DecimalFormat df = new DecimalFormat("#0.00");

        for (Brinquedo b : brinquedos) {
            // Sorteio de um desconto entre 0% e 10% (Uso da classe Math)
            double descontoPercentual = Math.random() * 10;  // Gera de 0 a 10
            double desconto = b.getPreco() * (descontoPercentual / 100);
            double precoComDesconto = b.getPreco() - desconto;

            System.out.println("----- Detalhes do Brinquedo -----");
            System.out.println(b.toString());
            System.out.println("Desconto aplicado: " + df.format(descontoPercentual) + "%");
            System.out.println("Preço com desconto: R$ " + df.format(precoComDesconto));
            System.out.println();
        }

        // Exemplo de utilização das classes Object e String
        Object obj = brinquedos[0];
        String nomeMaiusculo = brinquedos[0].getNome().toUpperCase(); // Passa Strings para maiúsculas
        System.out.println("Exemplo com Object: " + obj.toString());
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
    }
}
