package exercicio05L05;

public class Pessoa {

    protected String nome;
    protected Long contribuinte;
    protected byte idade;

    public Pessoa(String nome, Long contribuinte, byte idade) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
    }
}
