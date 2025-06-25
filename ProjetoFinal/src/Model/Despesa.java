package Model;

import Enums.StatusPagamento;
import java.time.LocalDate;

public class Despesa extends MovimentacaoFinanceira {
    //Atributos
    protected String meioDePagamento;
    protected StatusPagamento status;

    //Construtor
    public Despesa(int id, String descricao, double valor, LocalDate data, String observacoes, Categoria categoria, String meioDePagamento) {
        super(id, descricao, valor, data, observacoes, categoria);
        this.meioDePagamento = meioDePagamento;
        this.status = StatusPagamento.NAO_PAGO;
    }

    //Metodos Sobrescritos
    @Override
    public void registrar() {
        System.out.println("Despesa registrada: " + descricao);
    }

    @Override
    public double calcularImpactoNoSaldo() {
        return -valor;
    }

    //Metodo
    public void marcarComoPaga() {
        this.status = StatusPagamento.PAGO;
    }

    //Gets e Sets
    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }

    public String getMeioDePagamento() {
        return meioDePagamento;
    }

    public void setMeioDePagamento(String meioDePagamento) {
        this.meioDePagamento = meioDePagamento;
    }
}
