package exercicio06;

public class Veiculo {

    private String proprietario;
    private int ano;

    public Veiculo(String proprietario, int ano) {
        this.proprietario = proprietario;
        this.ano = ano;
    }

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

    // Metodo para verificar se eh possivel fazer seguro por conta do ano do veículo.
    public String analiseAno() {
        if (ano < 2010) {
            return "O VEÍCULO NÃO PODE RECEBER UM SEGURO DEVIDO AO ANO SER INFERIOR A 2010";
        } else {
            return "O VEÍCULO ESTÁ APTO A RECEBER SEGURO";
        }
    }

    @Override
    public String toString() {
        return "VEICULO" +
                "\nProprietario: " + proprietario
                + "\nAno: " + ano
                + "\nAnalise de seguro: " + analiseAno()
                + "\n------------";
    }
}
