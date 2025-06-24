package exercicio04L06;

public class Militar extends Aeronaves{

    private String armamento;

    public Militar(String nome, double preco, double tamanho, int anoFabricacao, String armamento) {
        super(nome, preco, tamanho, anoFabricacao);
        this.armamento = armamento;
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "\n---Militar---" +
                super.toString() +
                "\nArmamento: " + armamento;

    }
}
