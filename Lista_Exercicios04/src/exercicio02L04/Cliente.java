package exercicio02L04;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "---Cliente---" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nValor da Divida: " + valorDivida +
                "\nAno de nascimento: " + anoNascim;
    }
}
