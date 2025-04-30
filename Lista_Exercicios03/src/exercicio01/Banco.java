package exercicio01;

public class Banco {

    private int codigo;
    private String nome;
    private String paisOrigem;

    public Banco(int codigo, String nome, String paisOrigem) {
        this.codigo = codigo;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "BANCO"
                + "\ncodigo:" + codigo
                + "\nnome:" + nome
                + "\npaís:" + paisOrigem
                + "\n------------";
    }
}
