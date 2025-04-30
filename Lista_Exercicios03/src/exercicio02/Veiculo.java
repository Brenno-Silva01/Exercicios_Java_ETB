package exercicio02;

public class Veiculo {

    private String proprietario;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "VEICULO" +
                "\nProprietario: " + proprietario
                + "\nAno: " + ano
                + "------------";
    }
}
