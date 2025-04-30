package exercicio01;

public class Cliente {

    private String nome;
    private String identidade;
    private String cpf;

    public Cliente(String nome, String identidade, String cpf) {
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "CLIENTE"
                + "\nnome:" + nome
                + "\nidentidade:" + identidade
                + "\ncpf:" + cpf
                + "\n------------";
    }
}
