package exercicio05L05;

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, Long contribuinte, byte idade, int matricula, double salario, String setor, double ajudaDeCusto) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        return (super.calcularSalario() + ajudaDeCusto);
    }

    @Override
    public String toString() {
        return "---Administrador---" +
                "\nAjuda De Custo: " + ajudaDeCusto +
                "\nMatricula: " + matricula +
                "\nSalario base: " + salario +
                "\nSetor: " + setor +
                "\nNome: " + nome +
                "\nContribuinte: " + contribuinte +
                "\nIdade: " + idade +
                "\nSalario final: " + calcularSalario();
    }
}
