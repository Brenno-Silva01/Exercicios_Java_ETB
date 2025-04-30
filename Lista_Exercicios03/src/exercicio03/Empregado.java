package exercicio03;

import java.util.Date;

public class Empregado {

    private String nome;
    private String matricula;
    private Date dataNascimento;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EMPREGADO" +
                "\nNome: " + nome +
                "\nMatrícula: " + matricula +
                "\nData de Nascimento: " + dataNascimento +
                "\nSalário: " + salario +
                "------------";
    }
}
