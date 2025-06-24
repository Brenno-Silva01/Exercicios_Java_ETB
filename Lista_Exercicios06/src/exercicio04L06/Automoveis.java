package exercicio04L06;

public class Automoveis extends Brinquedo{

    protected double velocidade;
    protected double aceleracao;

    public Automoveis(String nome, double preco, double velocidade, double aceleracao) {
        super(nome, preco);
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nVelocidade: " + velocidade + " km/h" +
                "\nAceleração: " + aceleracao + " m/s²";
    }
}
