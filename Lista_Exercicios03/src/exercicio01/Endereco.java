package exercicio01;

public class Endereco {

    private String rua;
    private int numero;
    private String telefone;

    public Endereco(String rua, int numero, String telefone) {
        this.rua = rua;
        this.numero = numero;
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ENDEREÇO"
                + "\nrua:" + rua
                + "\nnumero:" + numero
                + "\ntelefone:" + telefone
                + "\n------------";
    }
}
