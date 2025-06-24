package exercicio04L06;

public class Passeio extends Automoveis{

    private int qntPortas;

    public Passeio(String nome, double preco, double velocidade, double aceleracao, int qntPortas) {
        super(nome, preco, velocidade, aceleracao);
        this.qntPortas = qntPortas;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    @Override
    public String toString() {
        return "\n---Passeio---" +
                super.toString() +
                "\nQnt. de Portas: " + qntPortas;
    }
}
