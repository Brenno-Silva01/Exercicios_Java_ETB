package exercicio05L05;

public class Vendedor extends Empregado{

    private double comissao;
    private double valorVendas;

    public Vendedor(String nome, Long contribuinte, byte idade, int matricula, double salario, String setor, double comissao, double valorVendas) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.comissao = comissao;
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario(){
        return (super.calcularSalario() + (comissao * valorVendas));
    }

    @Override
    public String toString() {
        return "---Vendedor---" +
                "\nComissao: " + comissao +
                "\nValor Vendas: " + valorVendas +
                "\nMatricula: " + matricula +
                "\nSalario base: " + salario +
                "\nSetor: " + setor +
                "\nNome: " + nome +
                "\nContribuinte: " + contribuinte +
                "\nIdade: " + idade +
                "\nSalario final: " + calcularSalario();
    }
}
