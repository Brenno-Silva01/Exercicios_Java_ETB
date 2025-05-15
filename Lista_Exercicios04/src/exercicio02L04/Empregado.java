package exercicio02L04;

public class Empregado extends Pessoa{
    protected double salario;
    protected String matricula;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss(){
        return (this.salario * 0.11);
    }
}
