package exercicio05L05;

public class Fornecedor extends Pessoa{

    private double receita;
    private double despesa;

    public Fornecedor(String nome, Long contribuinte, byte idade, double receita, double despesa) {
        super(nome, contribuinte, idade);
        this.receita = receita;
        this.despesa = despesa;
    }

    public double obterSaldo(){
        return (receita - despesa);
    }

    @Override
    public String toString() {
        return "---Fornecedor---" +
                "\nReceita: " + receita +
                "\nDespesa: " + despesa +
                "\nNome: " + nome +
                "\nContribuinte: " + contribuinte +
                "\nIdade: " + idade +
                "\nSaldo: " + obterSaldo();
    }
}