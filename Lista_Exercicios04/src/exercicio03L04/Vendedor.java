package exercicio03L04;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double porcComissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double porcComissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.porcComissao = porcComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPorcComissao() {
        return porcComissao;
    }

    public void setPorcComissao(double porcComissao) {
        this.porcComissao = porcComissao;
    }

    public double calculoComissao(){
        double comissao;
        double porcentagem;
        porcentagem = porcComissao / 100;
        comissao = valorVendas * porcentagem;
        return comissao;
    }

    @Override
    public String toString() {
        return "---Vendedor---" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nCódigo do Setor: " + codigoSetor +
                "\nSalário Base: " + salarioBase +
                "\nImposto sobre o salário: " + imposto + "%" +
                "\nValor total das vendas realizadas: " + valorVendas +
                "\nValor de comissão a receber: " + calculoComissao() +
                "\nValor final do salário do vendedor: " + (calcularSalario() + calculoComissao());
    }
}
