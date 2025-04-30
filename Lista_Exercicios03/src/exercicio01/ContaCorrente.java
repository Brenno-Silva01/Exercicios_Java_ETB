package exercicio01;

public class ContaCorrente {

    private int numero;
    private int tipo;
    private double saldo;

    public ContaCorrente(int numero, int tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CONTA CORRENTE"
                + "\nnumero:" + numero +
                "\ntipo:" + tipo
                + "\nsaldo:" + saldo
                + "\n------------";
    }
}
