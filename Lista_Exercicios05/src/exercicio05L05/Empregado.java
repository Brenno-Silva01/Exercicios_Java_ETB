package exercicio05L05;

public class Empregado extends Pessoa{

    protected int matricula;
    protected double salario;
    protected String setor;

    public Empregado(String nome, Long contribuinte, byte idade, int matricula, double salario, String setor) {
        super(nome, contribuinte, idade);
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;
    }

    public double calcularSalario(){
        return (salario - (salario * 0.11));
    }
}
