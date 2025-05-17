package exercicio03L04;

public class Operario extends Empregado{
    private double valorProducao;
    private double porcComissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double porcComissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.porcComissao = porcComissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
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
        comissao = valorProducao * porcentagem;
        return comissao;
    }

    @Override
    public String toString() {
        return "---Operário---" +
                "\nNome: " + nome +
                "\nEndereco: " + endereco +
                "\nTelefone: " + telefone +
                "\nCódigo do Setor:" + codigoSetor +
                "\nSalário Base: " + salarioBase +
                "\nImposto sobre o salário: " + imposto + "%" +
                "\nValor da Produção realizada: " + valorProducao +
                "\nValor de comissão a receber: " + calculoComissao() +
                "\nValor final do salário do operário: " + (calcularSalario() + calculoComissao());
    }
}
