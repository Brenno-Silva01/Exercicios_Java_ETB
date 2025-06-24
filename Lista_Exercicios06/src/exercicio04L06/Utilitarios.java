package exercicio04L06;

public class Utilitarios extends Automoveis{

    private int qntEixos;

    public Utilitarios(String nome, double preco, double velocidade, double aceleracao, int qntEixos) {
        super(nome, preco, velocidade, aceleracao);
        this.qntEixos = qntEixos;
    }

    public int getQntEixos() {
        return qntEixos;
    }

    public void setQntEixos(int qntEixos) {
        this.qntEixos = qntEixos;
    }

    @Override
    public String toString() {
        return "\n---Utilitarios---" +
                super.toString() +
                "\nQnt. de Eixos: " + qntEixos;
    }
}
