package exercicio05L05;

public class Operario extends Empregado{

    private double comissao;
    private double valorProducao;

    public Operario(String nome, Long contribuinte, byte idade, int matricula, double salario, String setor, double comissao, double valorProducao) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.comissao = comissao;
        this.valorProducao = valorProducao;
    }

    @Override
    public double calcularSalario(){
        return (super.calcularSalario() + (comissao * valorProducao));
    }

    @Override
    public String toString() {
        return "---Operario---" +
                "\nComissao: " + comissao +
                "\nValor Producao: " + valorProducao +
                "\nMatricula: " + matricula +
                "\nSalario base: " + salario +
                "\nSetor: " + setor +
                "\nNome: " + nome +
                "\nContribuinte: " + contribuinte +
                "\nIdade: " + idade +
                "\nSalario final: " + calcularSalario();
    }
}
