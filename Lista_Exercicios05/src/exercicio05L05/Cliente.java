package exercicio05L05;

public class Cliente extends Pessoa{

    private String email;
    private String telefone;

    public Cliente(String nome, Long contribuinte, byte idade, String email, String telefone) {
        super(nome, contribuinte, idade);
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "---Cliente---" +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nNome: " + nome +
                "\nContribuinte: " + contribuinte +
                "\nIdade: " + idade;
    }
}
