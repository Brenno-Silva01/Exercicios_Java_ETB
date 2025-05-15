package exercicio02L04;

public class Gerente extends Empregado{
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "---Gerente---" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nMatrícula: " + matricula +
                "\nNome da Gerência: " + nomeGerencia +
                "\nValor do INSS: " + valorInss();
    }
}
