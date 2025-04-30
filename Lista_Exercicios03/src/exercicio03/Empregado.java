package exercicio03;

import java.time.LocalDate;

public class Empregado {

    private String nome;
    private String matricula;
    private LocalDate dataNascimento;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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
                "\n------------";
    }
}
