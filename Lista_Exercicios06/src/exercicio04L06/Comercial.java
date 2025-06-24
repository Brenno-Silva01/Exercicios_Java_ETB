package exercicio04L06;

public class Comercial extends Aeronaves{

    private int qntPassageiros;

    public Comercial(String nome, double preco, double tamanho, int anoFabricacao, int qntPassageiros) {
        super(nome, preco, tamanho, anoFabricacao);
        this.qntPassageiros = qntPassageiros;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(int qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    @Override
    public String toString() {
        return "\n---Comercial---" +
                super.toString() +
                "\nQnt. de Passageiros: " + qntPassageiros;
    }
}
