package exercicio04L06;

import java.text.DecimalFormat;

public class Brinquedo {

    protected String nome;
    protected double preco;

    public Brinquedo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método estático
    public static void mensagemLoja() {
        System.out.println("----- Bem-vindo à Loja de Brinquedos -----");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        // SimpleDateFormat
        DecimalFormat df = new DecimalFormat("#0.00");

        return  "\nNome: " + nome +
                "\nPreço: R$" + df.format(preco);
    }
}
