package Model;

import Enums.StatusRecebimento;
import java.time.LocalDate;

public class Receita extends MovimentacaoFinanceira {
    //Atributos
    protected String fonte;
    protected StatusRecebimento status;

    //Construtor
    public Receita(int id, String descricao, double valor, LocalDate data, String observacoes, Categoria categoria, String fonte) {
        super(id, descricao, valor, data, observacoes, categoria);
        this.fonte = fonte;
        this.status = StatusRecebimento.AH_RECEBER;
    }

    //Metodos Sobrescritos
    @Override
    public void registrar() {
        System.out.println("Receita registrada: " + descricao);
    }

    @Override
    public double calcularImpactoNoSaldo() {
        return valor;
    }

    //Metodo
    public void marcarComoRecebida() {
        this.status = StatusRecebimento.RECEBIDO;
    }

    //Gets e Sets
    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public StatusRecebimento getStatus() {
        return status;
    }

    public void setStatus(StatusRecebimento status) {
        this.status = status;
    }
}

