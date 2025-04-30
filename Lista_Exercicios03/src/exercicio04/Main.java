package exercicio04;

import exercicio02.Veiculo;
import exercicio03.Empregado;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Veiculo v1 = new Veiculo();
        v1.setProprietario("Brenno");
        v1.setAno(1969);

        Veiculo v2 = new Veiculo();
        v2.setProprietario("Airton Senna");
        v2.setAno(1996);

        Empregado e1 = new Empregado();
        e1.setNome("Brenno");
        e1.setDataNascimento(LocalDate.parse("2001-01-01"));
        e1.setMatricula("380881");
        e1.setSalario(3400);

        Empregado e2 = new Empregado();
        e2.setNome("Cadu");
        e2.setDataNascimento(LocalDate.parse("2006-03-14"));
        e2.setMatricula("398117");
        e2.setSalario(5630);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
