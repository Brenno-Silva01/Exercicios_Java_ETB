package exercicio01L06;

import java.text.DecimalFormat;

public class FormataValores {
    public static void main(String[] args) {

        // Idade 38 para 038
        DecimalFormat idade = new DecimalFormat("000");
        System.out.println("Idade: " + idade.format(38));

        // Quantidade 9750 para 9.750
        DecimalFormat quantidade = new DecimalFormat("#,###");
        System.out.println("Quantidade: " + quantidade.format(9750));

        // Estoque 198564 para 198.564
        DecimalFormat estoque = new DecimalFormat("#,###");
        System.out.println("Estoque: " + estoque.format(198564));

        // Peso 7025 para 70,25
        DecimalFormat peso = new DecimalFormat("#0.00"); // Usa #0.00 para garantir duas casas decimais
        System.out.println("Peso: " + peso.format((double) 7025 / 100)); // Dividi por 100 para obter o valor correto

        // Valor 2583.75 para R$ 2.583,75
        DecimalFormat valor = new DecimalFormat("R$ #,##0.00");
        System.out.println("Valor: " + valor.format(2583.75));
    }
}
