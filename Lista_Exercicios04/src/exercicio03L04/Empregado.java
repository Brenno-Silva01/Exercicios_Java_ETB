package exercicio03L04;

public class Empregado extends Pessoa{
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double porcentagemImp;
        double desconto;
        porcentagemImp = imposto / 100;
        desconto = salarioBase * porcentagemImp;
        return salarioBase - desconto;
    }

    @Override
    public String toString() {
        return "---Empregado---" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nCódigo do Setor: " + codigoSetor +
                "\nSalário Base:" + salarioBase +
                "\nImposto sobre o salário: " + imposto + "%" +
                "\nValor do Salário com descontos de impostos: " + calcularSalario() ;
    }
}
