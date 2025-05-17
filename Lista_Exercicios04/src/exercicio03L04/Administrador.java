package exercicio03L04;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "---Administrador---" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nCódigo do Setor: " + codigoSetor +
                "\nValor da Ajuda de Custo: " + ajudaDeCusto +
                "\nSalário base: " + salarioBase +
                "\nImposto sobre o salário: " + imposto + "%" +
                "\nSalário final do Administrador: " +  (calcularSalario() + ajudaDeCusto);
    }
}
