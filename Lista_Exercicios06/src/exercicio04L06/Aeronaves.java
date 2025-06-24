package exercicio04L06;

public class Aeronaves extends Brinquedo{

    protected double tamanho;
    protected int anoFabricacao;

    public Aeronaves(String nome, double preco, double tamanho, int anoFabricacao) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.anoFabricacao = anoFabricacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTamanho: " + tamanho + "m" +
                "\nAno: " + anoFabricacao;
    }
}
